package com.jtrent238.coremod.handlers;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeHandler implements IVillageTradeHandler
{
	//private static final int Ted = EntityLoader.Ted;

	//public static MerchantRecipeList manipulateTradesForVillager;

	@Override
	public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
	{
		switch(villager.getProfession()) {
		case 22: //Villager Of Epic Proportions
			// standard trade
			//recipeList.add(new MerchantRecipe(new ItemStack(ItemLoader.itemEpicProportionsStar, 24), new ItemStack(ItemLoader.itemSwordOfEpicProportions_Part1, 1)));

			
			
			
			break;
		
			
		default:
			break;
		
	
		}
		
	}
}