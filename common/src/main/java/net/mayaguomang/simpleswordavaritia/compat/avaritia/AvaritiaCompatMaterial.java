package net.mayaguomang.simpleswordavaritia.compat.avaritia;

import com.google.common.base.Suppliers;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public enum AvaritiaCompatMaterial implements ToolMaterial {

    INFINITY(MiningLevels.NETHERITE, 9999, 50.0f, 20.0f, 50, Registries.ITEM.get(new Identifier("avaritia:infinity_ingot"))),
    NEUTRONIUM(MiningLevels.NETHERITE, 50000, 30.0f, 15.0f, 40, Registries.ITEM.get(new Identifier("avaritia:neutronium_ingot"))),
    BLAZEIRON(MiningLevels.NETHERITE, 10000, 15.0f, 10.0f, 30, Registries.ITEM.get(new Identifier("avaritia:blazeiron_ingot")));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    AvaritiaCompatMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Item... repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(() -> Ingredient.ofItems(repairIngredient));
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
