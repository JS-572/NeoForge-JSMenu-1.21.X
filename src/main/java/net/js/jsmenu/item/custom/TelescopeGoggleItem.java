package net.js.jsmenu.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;
import java.util.Locale;

public class TelescopeGoggleItem extends ArmorItem {
    public static final float MAX_MAGNIFICATION = 8.0F;

    public TelescopeGoggleItem(Holder<ArmorMaterial> material, Properties properties) {
        super(material, Type.HELMET, properties);
    }

    public static float getMagnification() {
        return Math.max(1.0F, MAX_MAGNIFICATION);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext tooltipContext, List<Component> tooltip, TooltipFlag tooltipFlag) {
        tooltip.add(Component.translatable(
                "item.jsmenu.telescope_goggle.tooltip",
                String.format(Locale.ROOT, "%.1f", getMagnification())
        ));
    }
}
