
package net.assortedmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.assortedmod.AssortedmodModElements;

@AssortedmodModElements.ModElement.Tag
public class Assortmenttab1ItemGroup extends AssortedmodModElements.ModElement {
	public Assortmenttab1ItemGroup(AssortedmodModElements instance) {
		super(instance, 33);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabassortmenttab_1") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Items.END_CRYSTAL);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
