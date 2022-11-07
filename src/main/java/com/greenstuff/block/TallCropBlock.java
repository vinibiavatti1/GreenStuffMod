package com.greenstuff.block;

import java.util.function.Supplier;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.common.ForgeHooks;

/**
 * Tall Crop Class
 * @author ViniB
 */
public class TallCropBlock extends CropBlock {

    public static final BooleanProperty TOP = BooleanProperty.create("top");

    private final Supplier<? extends ItemLike> seedItem;

    /**
     * Create Tall Crop Block
     * @param proper properties
     * @param seed seed item to plant the block
     */
    public TallCropBlock(Properties proper, Supplier<? extends ItemLike> seed) {
        super(proper);
        this.seedItem = seed;
        this.registerDefaultState(this.stateDefinition.any().setValue(AGE, 0).setValue(TOP, false));
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return this.seedItem.get();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE, TOP);
    }

    @Override
    public boolean canSurvive(BlockState p_52282_, LevelReader p_52283_, BlockPos p_52284_) {
        return internalCanSurvive(p_52282_, p_52283_, p_52284_);
    }

    @Override
    public void randomTick(BlockState p_221050_, ServerLevel p_221051_, BlockPos p_221052_, RandomSource p_221053_) {
        internalRandomTick(p_221050_, p_221051_, p_221052_, p_221053_);
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter p_52258_, BlockPos p_52259_, BlockState p_52260_, boolean p_52261_) {
        return internalIsValidBonemealTarget(p_52258_, p_52259_, p_52260_, p_52261_);
    }

    @Override
    public boolean isBonemealSuccess(Level p_221045_, RandomSource p_221046_, BlockPos p_221047_, BlockState p_221048_) {
        return internalIsBonemealSuccess(p_221045_, p_221046_, p_221047_, p_221048_);
    }

    @Override
    public void performBonemeal(ServerLevel p_221040_, RandomSource p_221041_, BlockPos p_221042_, BlockState p_221043_) {
        internalPerformBonemeal(p_221040_, p_221041_, p_221042_, p_221043_);
    }

    /**
     * Check if the block can survive
     * @param state block state
     * @param level level reader
     * @param position block position
     * @return true if the block can survive, otherwise false
     */
    private boolean internalCanSurvive(BlockState state, LevelReader level, BlockPos position) {
        // Check brightness and sky
        if (!level.canSeeSky(position) && level.getRawBrightness(position, 0) < 8) {
            return false;
        }

        // If the block is the BASE one, check the age and the above block
        if (!state.getValue(TOP)) {
            BlockState above = level.getBlockState(position.above());
            int currentAge = state.getValue(AGE);
            if (currentAge == getMaxAge() && !above.is(this)) {
                return false;
            }
            return super.canSurvive(state, level, position);
        }

        // If the block is the TOP one, check the base block
        BlockState below = level.getBlockState(position.below());
        if (below.is(this)) {
            return true;
        }
        return super.canSurvive(state, level, position);
    }

    /**
     * Increase block age by random tick
     * @param state block state
     * @param level level reader
     * @param position block position
     * @param random random instance
     */
    private void internalRandomTick(BlockState state, ServerLevel level, BlockPos position, RandomSource random) {
        if (!level.isAreaLoaded(position, 1)) {
            return;
        }
        if (state.getValue(TOP)) {
            return;
        }
        if (!level.canSeeSky(position) && level.getRawBrightness(position, 0) < 9) {
            return;
        }
        if (state.getValue(AGE) == getMaxAge()) {
            return;
        }

        float growSpeed = getGrowthSpeed(this, level, position);
        if (ForgeHooks.onCropsGrowPre(level, position, state, random.nextInt((int)(25.0F / growSpeed) + 1) == 0)) {
            grow(level, position, state);
            ForgeHooks.onCropsGrowPost(level, position, state);
        }
    }

    /**
     * Check if the block is a valid bonemeal target
     * @param level level reader
     * @param position block position
     * @param state block state
     * @param isClient is client
     * @return true if the block can be hit with bonemeal, otherwise false
     */
    private boolean internalIsValidBonemealTarget(BlockGetter level, BlockPos position, BlockState state, boolean isClient) {
        if (state.getValue(TOP)) {
            return false;
        }
        int currentAge = state.getValue(AGE);
        if (currentAge == getMaxAge()) {
            return false;
        }
        if (currentAge == getMaxAge() - 1) {
            if (!level.getBlockState(position.above()).isAir()) {
                return false;
            }
        }
        return true;
    }

    /**
     * Check if the bonemeal could be applied
     * @param level level reader
     * @param random random instance
     * @param position block position
     * @param state block state
     * @return true if the bonemeal could be applied
     */
    private boolean internalIsBonemealSuccess(Level level, RandomSource random, BlockPos position, BlockState state) {
        return true;
    }

    /**
     * Execute bonemeal action
     * @param level level reader
     * @param random random instance
     * @param position block position
     * @param state block state
     */
    private void internalPerformBonemeal(ServerLevel level, RandomSource random, BlockPos position, BlockState state) {
        grow(level, position, state);
    }

    /**
     * Execute block's grow action
     * @param level level reader
     * @param position block position
     * @param state block state
     */
    private void grow(ServerLevel level, BlockPos position, BlockState state) {
        if (state.getValue(TOP)) {
            return;
        }
        int currentAge = state.getValue(AGE);
        if (currentAge < getMaxAge()) {
            if (currentAge + 1 == getMaxAge()) {
                BlockState above = level.getBlockState(position.above());
                if (!above.isAir()) {
                    return;
                }
                addTopBlock(level, position);
            }
            state = state.setValue(AGE, currentAge + 1);
            level.setBlockAndUpdate(position, state);
        }
    }

    /**
     * Create top above block with TOP property as true and max age
     * @param level level reader
     * @param position block position
     */
    private void addTopBlock(ServerLevel level, BlockPos position) {
        BlockPos above = position.above();
        BlockState state = defaultBlockState();
        state = state.setValue(TOP, true);
        state = state.setValue(AGE, getMaxAge());
        level.setBlockAndUpdate(above, state);
    }
}