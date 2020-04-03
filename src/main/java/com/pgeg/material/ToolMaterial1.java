package com.pgeg.material;

import com.pgeg.registry.Pitems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterial1 implements ToolMaterial {
    @Override
    public float getAttackDamage() {
        return 2.1f;
    }

    @Override
    public int getDurability() {
        return 200;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public int getMiningLevel(){
        return 1;
    }

    @Override
    public float getMiningSpeed() {
        return 5;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Pitems.AMBER);

    }
}
