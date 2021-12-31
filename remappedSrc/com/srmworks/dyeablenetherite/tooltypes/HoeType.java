package com.srmworks.dyeablenetherite.tooltypes;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class HoeType extends HoeItem {
    public HoeType(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}