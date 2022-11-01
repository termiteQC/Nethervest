package net.termiteqc.nethervestmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.termiteqc.nethervestmod.block.ModBlocks;

public class ModCreativeModeTab {
    public static final CreativeModeTab NETHERVEST_TAB_FRUITS = new CreativeModeTab("nethervesttabfruits") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IBEO_FLOWER.get());
        }
    };
    public static final CreativeModeTab NETHERVEST_TAB_LEGUMES = new CreativeModeTab("nethervesttablegumes") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NETHEART.get());
        }
    };
    public static final CreativeModeTab NETHERVEST_TAB_SEEDS = new CreativeModeTab("nethervesttabseeds") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.IBEO_FLOWER_SEED.get());
        }
    };
    public static final CreativeModeTab NETHERVEST_TAB_FARMLANDS = new CreativeModeTab("nethervesttabfarmlands") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.NETHERRACK_FARMLAND_BLOCK.get());
        }
    };
}
