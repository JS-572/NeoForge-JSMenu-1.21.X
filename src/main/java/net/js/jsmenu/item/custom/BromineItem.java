package net.js.jsmenu.item.custom;

import net.js.jsmenu.fluid.ModFluids;
import net.js.jsmenu.item.ModItems;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;

public class BromineItem extends BucketItem {
    public BromineItem() {
        super(ModFluids.BROMINE.get(), new Properties().craftRemainder(Items.BUCKET).stacksTo(1));
    }
}
