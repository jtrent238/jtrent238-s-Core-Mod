package com.jtrent238.jtcoremod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.common.util.EnumHelper;

public class JTAPI {

	/**
	 * Add a new creative tab
	 */
	public static void addNewCreativeTab(String tabName, Item tabItem, boolean hasSearchBar) {
			
			CreativeTabs tab_HammerMod = new CreativeTabs(tabName) {
				
		    	public ItemStack getTabIconItem() {
		    		return new ItemStack(tabItem);
		    	}
		    	
		    	public boolean hasSearchBar(){
		    		return hasSearchBar;
		    	}
		    	
		    };
		}
	
	/**
	 * Add a new Tool Material
	 */
	public static void addNewToolMaterial(String material, int harvestLevel,  int durability,  int miningSpeed,  int damageVsEntities,  int enchantability) {
		EnumHelper.addToolMaterial(material, harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);
	}


}
