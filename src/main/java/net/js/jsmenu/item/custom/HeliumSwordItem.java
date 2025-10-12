package net.js.jsmenu.item.custom;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class HeliumSwordItem extends SwordItem {
    public HeliumSwordItem(Tier tier, int attackDamageModifier, float attackSpeedModifier, Item.Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.level().isClientSide) {
            target.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 100, 3));
            target.level().scheduleTick(target.blockPosition(), target.level().getBlockState(target.blockPosition()).getBlock(), 0);
            target.level().getServer().execute(() -> {
                if (target.isAlive()) {
                    DamageSource heliumSource = target.damageSources().playerAttack((Player) attacker);
                }
            });
        }
        return super.hurtEnemy(stack, target, attacker);
    }
}
