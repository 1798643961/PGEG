package com.pgeg.registry;

import com.pgeg.items.*;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Pitems {
    public static final ItemGroup PGEG_GROUP = FabricItemGroupBuilder.build(new Identifier("pgeg", "group"), () -> new ItemStack(Pitems.PG_EG));
    public static final Item PG_EG = new Item(new Item.Settings());
    public static final Item AMBER = new Amber(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item WAND = new Wand(new Item.Settings().group(Pitems.PGEG_GROUP).maxCount(1));
    public static final Item SPELL_BOOK = new SpellBook(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item SCROLL = new Scroll(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item GOLD_RING = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item AMETHYST = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item MITHRIL_INGOT = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item BRIMSTONE_INGOT = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item METEORITE_INGOT = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item ORICHALCUM_INGOT = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));
    public static final Item SATURNIUM_INGOT = new Item(new Item.Settings().group(Pitems.PGEG_GROUP));

    public static void init() {
        Registry.register(Registry.ITEM,new Identifier("pgeg","pg_eg"),PG_EG);
        Registry.register(Registry.ITEM,new Identifier("pgeg","amber"),AMBER);
        Registry.register(Registry.ITEM,new Identifier("pgeg","wand"),WAND);
        Registry.register(Registry.ITEM,new Identifier("pgeg","spell_book"),SPELL_BOOK);
        Registry.register(Registry.ITEM,new Identifier("pgeg","scroll"),SCROLL);
        Registry.register(Registry.ITEM,new Identifier("pgeg","gold_ring"),GOLD_RING);
        Registry.register(Registry.ITEM,new Identifier("pgeg","amethyst"),AMETHYST);
        Registry.register(Registry.ITEM,new Identifier("pgeg","mithril_ingot"),MITHRIL_INGOT);
        Registry.register(Registry.ITEM,new Identifier("pgeg","brimstone_ingot"),BRIMSTONE_INGOT);
        Registry.register(Registry.ITEM,new Identifier("pgeg","meteorite_ingot"),METEORITE_INGOT);
        Registry.register(Registry.ITEM,new Identifier("pgeg","saturnium_ingot"),SATURNIUM_INGOT);
    }
}
