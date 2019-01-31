package doctormario.alternateprogressionmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class TestBlock extends BlockBase {

	public TestBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.SLIME);
		setHardness(0.6F);
		setResistance(3.0F);
		setHarvestLevel("shovel", 0);
		
	}

}
