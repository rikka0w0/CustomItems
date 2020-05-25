package me.otho.customItems.mod.blocks;

import me.otho.customItems.configuration.jsonReaders.blocks.Cfg_block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CustomStairsBlock extends StairsBlock implements IBlockInterfaces {
	private final Cfg_block.BlockData blockData;

	public CustomStairsBlock(Cfg_block data) {
		super(()->Blocks.AIR.getDefaultState(), data.blockProp());	// TODO: check 1st param
		this.blockData = data.postConstruction(this);
	}

	@Override
	public String getRenderLayerName() {
		return blockData.layer;
	}
	
	@Override
	public Item asItem() {
		return blockData.blockItem;
	}
	
	@Override
	public String[] getTextureNamesRaw() {
		return blockData.textureNames;
	}
	
	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return blockData.opacity;
	}
}
