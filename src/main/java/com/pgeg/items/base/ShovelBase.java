package com.pgeg.items.base;

import com.pgeg.material.ToolMaterial1;
import com.pgeg.registry.Pitems;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ShovelBase extends ShovelItem {

    public ShovelBase(ToolMaterial1 material) {
        super(material, +2, +1.0f, new Item.Settings().group(Pitems.PGEG_GROUP));
    }
}