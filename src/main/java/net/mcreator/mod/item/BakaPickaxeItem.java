
package net.mcreator.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.mod.BakamodModElements;

@BakamodModElements.ModElement.Tag
public class BakaPickaxeItem extends BakamodModElements.ModElement {
	@ObjectHolder("bakamod:baka_pickaxe")
	public static final Item block = null;

	public BakaPickaxeItem(BakamodModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 100f;
			}

			public float getAttackDamage() {
				return 1508f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("baka_pickaxe"));
	}
}
