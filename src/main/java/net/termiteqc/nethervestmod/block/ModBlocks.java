package net.termiteqc.nethervestmod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.termiteqc.nethervestmod.NetherVestMod;
import net.termiteqc.nethervestmod.block.custom.*;
import net.termiteqc.nethervestmod.item.ModCreativeModeTab;
import net.termiteqc.nethervestmod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NetherVestMod.MOD_ID);

    public static final RegistryObject<Block> IBEO_FLOWER_CROP = BLOCKS.register("ibeo_flower_crop",
            () -> new IbeoFlowerCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> ECCUKRA_STAR_CROP = BLOCKS.register("eccukra_star_crop",
            () -> new EccukraStarCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> DEMON_CALAMANSI_CROP = BLOCKS.register("demon_calamansi_crop",
            () -> new DemonCalamansiCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> VIOLET_ACEROLA_CROP = BLOCKS.register("violet_acerola_crop",
            () -> new VioletAcerolaCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> NETHEART_CROP = BLOCKS.register("netheart_crop",
            () -> new NetheartCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> HATE_PEA_CROP = BLOCKS.register("hate_pea_crop",
            () -> new HatePeaCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> PYGMY_OLIVE_CROP = BLOCKS.register("pygmy_olive_crop",
            () -> new PygmyOliveCropBlock(BlockBehaviour.Properties.copy(Blocks.CARROTS)));

    public static final RegistryObject<Block> SPIKY_XEOGUS_CROP = BLOCKS.register("spiky_xeogus_crop",
            () -> new SpikyXeogusCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT)));


    public static final RegistryObject<Block> NETHERRACK_FARMLAND_BLOCK = registerBlock("netherrack_farmland_block",
            () -> new NetherrackFarmlandBlock(BlockBehaviour.Properties.of(Material.DIRT)), ModCreativeModeTab.NETHERVEST_TAB_FARMLANDS);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    }

