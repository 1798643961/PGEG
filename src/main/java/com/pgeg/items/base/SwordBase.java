package com.pgeg.items.base;

import com.pgeg.material.ToolMaterial1;
import com.pgeg.registry.Pitems;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {

    public SwordBase(ToolMaterial1 material) {
        super(material, +7, +1.0f, new Item.Settings().group(Pitems.PGEG_GROUP));
    }
}