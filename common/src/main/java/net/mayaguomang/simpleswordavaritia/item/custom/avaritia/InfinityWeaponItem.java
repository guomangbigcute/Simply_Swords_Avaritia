package net.mayaguomang.simpleswordavaritia.item.custom.avaritia;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.minecraft.client.item.TooltipContext;
import net.mayaguomang.simpleswordavaritia.item.SimpleSwordAvaritiaSwordItem;

import java.util.List;
import java.util.UUID;

public class InfinityWeaponItem extends SimpleSwordAvaritiaSwordItem {
    
    private static final float INFINITY_DAMAGE = Float.POSITIVE_INFINITY;
    // 使用固定的 UUID 来标识攻击伤害属性（与原版一致）
    private static final UUID ATTACK_DAMAGE_MODIFIER_ID = UUID.fromString("CB3F55D3-645C-4F38-A497-9C13A33DB5CF");

    public InfinityWeaponItem(ToolMaterial material, int attackDamage, float attackSpeed, String repairMaterial) {
        super(material, attackDamage, attackSpeed, repairMaterial);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        // 不调用 super.appendTooltip，我们将完全自定义 tooltip
        
        // 直接显示无限伤害（参考寰宇支配之剑）
        tooltip.add(Text.literal(""));
        tooltip.add(Text.translatable("item.simple_sword_avaritia.infinity_damage")
            .formatted(Formatting.DARK_PURPLE, Formatting.BOLD));
        tooltip.add(Text.translatable("item.simple_sword_avaritia.infinity_damage.description")
            .formatted(Formatting.GRAY));
    }

    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(EquipmentSlot slot) {
        Multimap<EntityAttribute, EntityAttributeModifier> modifiers = HashMultimap.create();
        
        if (slot == EquipmentSlot.MAINHAND) {
            // 添加攻击伤害属性，使用非常大的数值，但名称显示为"∞"
            // 注意：这里我们仍然需要设置一个实际的数值用于战斗计算
            modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, 
                new EntityAttributeModifier(
                    ATTACK_DAMAGE_MODIFIER_ID,
                    "attribute.name.generic.attack_damage_infinity", // 自定义翻译键
                    9999.0, // 实际伤害值（足够大）
                    EntityAttributeModifier.Operation.ADDITION
                )
            );
        }
        
        return modifiers;
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        // 不消耗耐久度，立即重置
        stack.setDamage(0);
        
        if (!attacker.getWorld().isClient() && attacker instanceof net.minecraft.entity.player.PlayerEntity player) {
            // 直接设置目标生命值为0（确保死亡）
            target.setHealth(0.0F);
            
            // 触发死亡逻辑
            target.onDeath(attacker.getWorld().getDamageSources().playerAttack(player));
            
            // 记录击杀
            if (attacker.getWorld() instanceof ServerWorld serverWorld) {
                player.onKilledOther(serverWorld, target);
            }
        }
        return super.postHit(stack, target, attacker);
    }
}
