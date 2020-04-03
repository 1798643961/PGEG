package com.pgeg.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

import java.util.List;

public class Amber extends Item {
    public Amber(Settings settings) {
        super(settings);
    }
    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> list, TooltipContext tooltipContext) {
        list.add(new TranslatableText("pgeg.amber.info"));
    }
}

