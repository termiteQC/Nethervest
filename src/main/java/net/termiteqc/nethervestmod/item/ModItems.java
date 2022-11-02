package net.termiteqc.nethervestmod.item;

import net.minecraft.core.Registry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.nethervestmod.NetherVestMod;
import net.termiteqc.nethervestmod.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NetherVestMod.MOD_ID);

    public static final RegistryObject<Item> IBEO_FLOWER = ITEMS.register("ibeo_flower",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_FRUITS)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));

    public static final RegistryObject<Item> IBEO_FLOWER_SEED = ITEMS.register("ibeo_flower_seed",
            () -> new ItemNameBlockItem(ModBlocks.IBEO_FLOWER_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> ECCUKRA_STAR = ITEMS.register("eccukra_star",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_FRUITS)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> ECCUKRA_STAR_SEED = ITEMS.register("eccukra_star_seed",
            () -> new ItemNameBlockItem(ModBlocks.ECCUKRA_STAR_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> DEMON_CALAMANSI = ITEMS.register("demon_calamansi",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_FRUITS)
                    .food(new FoodProperties.Builder().nutrition(1).saturationMod(0.3f).build())));
    public static final RegistryObject<Item> DEMON_CALAMANSI_SEED = ITEMS.register("demon_calamansi_seed",
            () -> new ItemNameBlockItem(ModBlocks.DEMON_CALAMANSI_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> VIOLET_ACEROLA = ITEMS.register("violet_acerola",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_LEGUMES)
                    .food(new FoodProperties.Builder().nutrition(3).saturationMod(0.8f).build())));

    public static final RegistryObject<Item> VIOLET_ACEROLA_SEED = ITEMS.register("violet_acerola_seed",
            () -> new ItemNameBlockItem(ModBlocks.VIOLET_ACEROLA_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> NETHEART = ITEMS.register("netheart",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_LEGUMES)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build())));

    public static final RegistryObject<Item> NETHEART_SEED = ITEMS.register("netheart_seed",
            () -> new ItemNameBlockItem(ModBlocks.NETHEART_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> HATE_PEA = ITEMS.register("hate_pea",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_LEGUMES)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build())));

    public static final RegistryObject<Item> HATE_PEA_SEED = ITEMS.register("hate_pea_seed",
            () -> new ItemNameBlockItem(ModBlocks.HATE_PEA_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> PYGMY_OLIVE_SEED = ITEMS.register("pygmy_olive_seed",
            () -> new ItemNameBlockItem(ModBlocks.PYGMY_OLIVE_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> PYGMY_OLIVE = ITEMS.register("pygmy_olive",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_LEGUMES)
                    .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5f).build())));

    public static final RegistryObject<Item> SPIKY_XEOGUS_SEED = ITEMS.register("spiky_xeogus_seed",
            () -> new ItemNameBlockItem(ModBlocks.SPIKY_XEOGUS_CROP.get()
                    , new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_SEEDS)));

    public static final RegistryObject<Item> SPIKY_XEOGUS = ITEMS.register("spiky_xeogus",
            () -> new XeogusFoodItem(new Item.Properties().tab(ModCreativeModeTab.NETHERVEST_TAB_FRUITS)
                    .food(new FoodProperties.Builder().nutrition(20).saturationMod(5.0f).build())));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
