package com.pgeg.registry;

import com.pgeg.PgegMod;
import com.pgeg.items.base.*;
import net.minecraft.util.registry.Registry;


public class Ptools {

    public static void init() {
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":brimstone_pickaxe", new PickaxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":brimstone_axe", new AxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":brimstone_shovel", new ShovelBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":brimstone_hoe", new HoeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":brimstone_sword", new SwordBase(Materials.TOOL_MATERIAL_1));

        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":meteorite_pickaxe", new PickaxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":meteorite_axe", new AxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":meteorite_shovel", new ShovelBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":meteorite_hoe", new HoeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":meteorite_sword", new SwordBase(Materials.TOOL_MATERIAL_1));

        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":mithril_pickaxe", new PickaxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":mithril_axe", new AxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":mithril_shovel", new ShovelBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":mithril_hoe", new HoeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":mithril_sword", new SwordBase(Materials.TOOL_MATERIAL_1));

        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":orichalcum_pickaxe", new PickaxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":orichalcum_axe", new AxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":orichalcum_shovel", new ShovelBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":orichalcum_hoe", new HoeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":orichalcum_sword", new SwordBase(Materials.TOOL_MATERIAL_1));

        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":saturnium_pickaxe", new PickaxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":saturnium_axe", new AxeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":saturnium_shovel", new ShovelBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":saturnium_hoe", new HoeBase(Materials.TOOL_MATERIAL_1));
        Registry.register(Registry.ITEM, PgegMod.MOD_ID + ":saturnium_sword", new SwordBase(Materials.TOOL_MATERIAL_1));

    }
}
