package com.jorji.dyeablenetherite.tooltypes;

import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class HoeType extends ShovelItem {
    public HoeType(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}