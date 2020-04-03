package com.pgeg.items.base;

import com.pgeg.material.ToolMaterial1;
import com.pgeg.registry.Pitems;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(ToolMaterial1 material) {
        super(material, +4, +1.0f, new Item.Settings().group(Pitems.PGEG_GROUP));
    }
}