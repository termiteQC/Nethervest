package net.termiteqc.nethervestmod.block.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.termiteqc.nethervestmod.item.ModItems;

public class PygmyOliveCropBlock extends CropBlock {

        public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 7);

        public PygmyOliveCropBlock(Properties properties) {
            super(properties);
        }

        @Override
        protected ItemLike getBaseSeedId() {
            return ModItems.PYGMY_OLIVE_SEED.get();
        }

        @Override
        public IntegerProperty getAgeProperty() {
            return AGE;
        }

        @Override
        public int getMaxAge() {
            return 7;
        }

        @Override
        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
            builder.add(AGE);
        }

    }
