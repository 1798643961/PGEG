package com.pgeg.items.base;

import com.pgeg.registry.Pitems;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;

public class HoeBase extends HoeItem {
    public HoeBase(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, +1.0F, new Item.Settings().group(Pitems.PGEG_GROUP));
    }
}