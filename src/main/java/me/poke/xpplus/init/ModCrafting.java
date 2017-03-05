package me.poke.xpplus.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockFlower;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {

	public static void register()
	{
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.BasicXPCrystal), " I ", "IEI", " I ", 'I', Items.IRON_INGOT, 'E', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.AdvancedXPCrystal), " I ", "INI", " I ", 'I', Items.IRON_INGOT, 'N', Items.NETHER_STAR);

		//Basic
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.JumpCard), "IRI", "ICI", "ISI", 'I', Items.IRON_INGOT, 'R', Items.RABBIT_FOOT, 'C', ModItems.BasicXPCrystal, 'S', Blocks.SLIME_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.SpeedCard), "ISI","ICI", "IFI", 'I', Items.IRON_INGOT, 'C', ModItems.BasicXPCrystal, 'S', Items.SUGAR, 'F', Items.CHORUS_FRUIT);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.HasteCard),  "ISI","ICI", "IRI", 'I', Items.IRON_INGOT, 'C', ModItems.BasicXPCrystal, 'R', Blocks.REDSTONE_BLOCK, 'S', Items.SUGAR);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ResistanceCard) , "IRI","ICI", "IRI", 'I', Items.IRON_INGOT, 'C', ModItems.BasicXPCrystal, 'R', Blocks.IRON_BLOCK);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.StrengthCard), "IPI","ICI","IBI", 'I', Items.IRON_INGOT, 'C', ModItems.BasicXPCrystal,'P', Items.BLAZE_POWDER, 'B', Items.BLAZE_ROD);
		//Advanced
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.HealingCard), "IEI", "ICI", "IEI", 'I', Items.IRON_INGOT, 'C', ModItems.AdvancedXPCrystal, 'E', Items.GOLDEN_APPLE);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.RainCard),  "IEI", "ICI", "IEI", 'I', Items.IRON_INGOT, 'C', ModItems.AdvancedXPCrystal, 'E', Items.WATER_BUCKET);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.DayCard),  "IBI", "ICI", "IGI", 'I', Items.IRON_INGOT, 'C', ModItems.AdvancedXPCrystal, 'G', Blocks.GLOWSTONE, 'B', Items.BLAZE_POWDER);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.NightCard), "IEI", "ICI","ISI", 'I', Items.IRON_INGOT, 'E', Items.ENDER_PEARL, 'S', Blocks.END_STONE, 'C', ModItems.AdvancedXPCrystal);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.ClearCard),  "IBI", "ICI", "IGI", 'I', Items.IRON_INGOT, 'C', ModItems.AdvancedXPCrystal, 'G', Blocks.GLOWSTONE, 'B', Blocks.YELLOW_FLOWER );


	}
}
