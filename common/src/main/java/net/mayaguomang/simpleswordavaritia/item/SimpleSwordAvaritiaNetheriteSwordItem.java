package net.mayaguomang.simpleswordavaritia.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.util.HelperMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleSwordAvaritiaNetheriteSwordItem extends SwordItem {
    String[] repairIngredient;

    public SimpleSwordAvaritiaNetheriteSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, String... repairIngredient) {
        super(toolMaterial, attackDamage, attackSpeed,
                new Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).fireproof());
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        List<Item> potentialIngredients = new ArrayList<>(List.of());
        Arrays.stream(repairIngredient).toList().forEach(repIngredient ->
            potentialIngredients.add(
                    Registries.ITEM.get(new Identifier(repIngredient))));


        return potentialIngredients.contains(ingredient.getItem());
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            HelperMethods.playHitSounds(attacker, target);
        }
        return super.postHit(stack, target, attacker);
    }

}
