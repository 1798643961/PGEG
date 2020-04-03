package com.pgeg.registry;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Food {
    public static final Item RICE = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build()).maxCount(64).group(Pitems.PGEG_GROUP));
    public static final Item RAW_SQUID = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build()).maxCount(64).group(Pitems.PGEG_GROUP));
    public static final Item COOKED_SQUID = new Item(new Item.Settings().food((new FoodComponent.Builder()).hunger(6).saturationModifier(0.3F).build()).maxCount(64).group(Pitems.PGEG_GROUP));


    public static void init() {
        Registry.register(Registry.ITEM, new Identifier("pgeg", "rice"), RICE);
        Registry.register(Registry.ITEM, new Identifier("pgeg", "raw_squid"), RAW_SQUID);
        Registry.register(Registry.ITEM, new Identifier("pgeg", "cooked_squid"), COOKED_SQUID);
    }
}