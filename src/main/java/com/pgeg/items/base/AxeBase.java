package com.pgeg.items.base;

import com.pgeg.material.ToolMaterial1;
import com.pgeg.registry.Pitems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class AxeBase extends AxeItem {

    public AxeBase(ToolMaterial1 material) {
        super(material, +6, +1.0f, new Item.Settings().group(Pitems.PGEG_GROUP));
    }
}