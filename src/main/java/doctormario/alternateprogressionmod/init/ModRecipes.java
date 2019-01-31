package doctormario.alternateprogressionmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		
		GameRegistry.addSmelting(ModBlocks.TEST_ORE, new ItemStack(ModItems.TEST_ITEM, 1), 1.5f);
		
	}
	
}
