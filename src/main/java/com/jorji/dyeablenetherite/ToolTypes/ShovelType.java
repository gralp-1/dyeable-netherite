package com.jorji.dyeablenetherite.ToolTypes;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class ShovelType extends ShovelItem {
    public ShovelType(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
