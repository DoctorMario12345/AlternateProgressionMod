package doctormario.alternateprogressionmod.init;

import java.util.ArrayList;
import java.util.List;

import doctormario.alternateprogressionmod.blocks.BlockBase;
import doctormario.alternateprogressionmod.blocks.TestBlock;
import doctormario.alternateprogressionmod.blocks.TestOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();;
	
	public static final Block TEST_BLOCK = new TestBlock("test_block", Material.IRON);
	public static final Block TEST_ORE = new TestOre("test_ore", Material.GROUND);
	
}
