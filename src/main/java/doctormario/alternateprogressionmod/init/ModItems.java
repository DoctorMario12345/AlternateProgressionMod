package doctormario.alternateprogressionmod.init;

import java.util.ArrayList;
import java.util.List;

import doctormario.alternateprogressionmod.items.ItemBase;
import doctormario.alternateprogressionmod.items.tools.ToolAxe;
import doctormario.alternateprogressionmod.items.tools.ToolHoe;
import doctormario.alternateprogressionmod.items.tools.ToolPickaxe;
import doctormario.alternateprogressionmod.items.tools.ToolSpade;
import doctormario.alternateprogressionmod.items.tools.ToolSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
		
		//Materials
		public static final ToolMaterial MATERIAL_TEST = EnumHelper.addToolMaterial("material_test", 2, 346, 2.5F, 2.0F, 14);
		
		// Items
		public static final List<Item> ITEMS = new ArrayList<Item>();
		public static final Item TEST_ITEM = new ItemBase("test_item");
		
		
		// Tools
		public static final ItemSword TEST_SWORD = new ToolSword("test_sword", MATERIAL_TEST);
		public static final ItemSpade TEST_SHOVEL = new ToolSpade("test_shovel", MATERIAL_TEST);
		public static final ItemPickaxe TEST_PICKAXE = new ToolPickaxe("test_pickaxe", MATERIAL_TEST);
		public static final ItemAxe TEST_AXE = new ToolAxe("test_axe", MATERIAL_TEST);
		public static final ItemHoe TEST_HOE = new ToolHoe("test_hoe", MATERIAL_TEST);
		
}
