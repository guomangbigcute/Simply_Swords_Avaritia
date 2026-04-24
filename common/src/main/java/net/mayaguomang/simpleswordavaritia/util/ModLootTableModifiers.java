package net.mayaguomang.simpleswordavaritia.util;

import dev.architectury.event.events.common.LootEvent;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.mayaguomang.simpleswordavaritia.config.Config;
import net.mayaguomang.simpleswordavaritia.config.ConfigDefaultValues;
import net.mayaguomang.simpleswordavaritia.config.SimpleSwordAvaritiaConfig;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;

public class ModLootTableModifiers {

    public static void init() {
        // Loot table modifiers disabled - only Infinity series weapons are used
    }
}