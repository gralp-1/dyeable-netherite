package com.srmworks.dyeablenetherite.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.srmworks.dyeablenetherite.materials.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.UUID;

@Mixin(ArmorItem.class)
public abstract class ArmorItemMixin {

    @Shadow
    @Final
    private static UUID[] MODIFIERS;
    @Shadow
    @Final
    protected float knockbackResistance;
    @Shadow
    @Final
    @Mutable
    private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;

    // I don't know what this is but it gives me kb resistance
    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void constructor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings, CallbackInfo ci) {
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];

        if (material == RedArmourMaterial.INSTANCE ||
                material == BlueArmourMaterial.INSTANCE ||
                material == GreenArmourMaterial.INSTANCE ||
                material == PurpleArmourMaterial.INSTANCE ||
                material == WhiteArmourMaterial.INSTANCE) {
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder = ImmutableMultimap.builder();

            this.attributeModifiers.forEach(builder::put);

            builder.put(
                    EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                    new EntityAttributeModifier(uUID,
                            "Armor knockback resistance",
                            this.knockbackResistance,
                            EntityAttributeModifier.Operation.ADDITION
                    )
            );

            this.attributeModifiers = builder.build();
        }
    }
}