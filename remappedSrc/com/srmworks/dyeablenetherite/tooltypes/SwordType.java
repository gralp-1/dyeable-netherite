package com.srmworks.dyeablenetherite.tooltypes;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class SwordType extends SwordItem {
    public SwordType(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
