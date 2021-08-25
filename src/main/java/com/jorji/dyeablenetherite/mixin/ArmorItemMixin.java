package com.jorji.dyeablenetherite.mixin;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.jorji.dyeablenetherite.materials.BlueArmourMaterial;
import com.jorji.dyeablenetherite.materials.GreenArmourMaterial;
import com.jorji.dyeablenetherite.materials.RedArmourMaterial;
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

    @Shadow @Final private static UUID[] MODIFIERS;
    @Shadow @Final @Mutable private Multimap<EntityAttribute, EntityAttributeModifier> attributeModifiers;
    @Shadow @Final protected float knockbackResistance;
    private Object RegisterItems;



    // I don't know what this is
    @Inject(method = "<init>", at = @At(value = "RETURN"))
    private void constructor(ArmorMaterial material, EquipmentSlot slot, Item.Settings settings, CallbackInfo ci) {
        UUID uUID = MODIFIERS[slot.getEntitySlotId()];

        if (material == RedArmourMaterial.INSTANCE || material == BlueArmourMaterial.INSTANCE || material == GreenArmourMaterial.INSTANCE) {
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