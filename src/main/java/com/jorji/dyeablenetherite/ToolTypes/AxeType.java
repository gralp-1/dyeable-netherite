package com.jorji.dyeablenetherite.ToolTypes;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class AxeType extends AxeItem {
    public AxeType(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}