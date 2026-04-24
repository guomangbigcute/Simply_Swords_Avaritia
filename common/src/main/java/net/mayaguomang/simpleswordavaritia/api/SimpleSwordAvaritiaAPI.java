package net.mayaguomang.simpleswordavaritia.api;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.mayaguomang.simpleswordavaritia.config.Config;
import net.mayaguomang.simpleswordavaritia.config.ConfigDefaultValues;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardEntity;
import net.mayaguomang.simpleswordavaritia.registry.EntityRegistry;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;
import net.mayaguomang.simpleswordavaritia.registry.SoundRegistry;
import net.mayaguomang.simpleswordavaritia.util.HelperMethods;
import net.mayaguomang.simpleswordavaritia.util.RunicMethods;

import java.util.List;

public class SimpleSwordAvaritiaAPI {


    // Battle Standard
    // Allows for the summoning of Battle Standard Entities. Can be configured with positive & negative effects (nullable)
    public static BattleStandardEntity spawnBattleStandard(PlayerEntity user, int decayRate, String standardType, int height, int distance,
                                                           String positiveEffect, String positiveEffectSecondary,
                                                           int positiveEffectAmplifier,
                                                           String negativeEffect, String negativeEffectSecondary,
                                                           int negativeEffectAmplifier,
                                                           boolean dealsDamage, boolean doesHealing) {

        if (!user.getWorld().isClient()) {
            ServerWorld world = (ServerWorld) user.getWorld();
            BlockState currentState = world.getBlockState(user.getBlockPos().up(height).offset(user.getMovementDirection(), distance));
            BlockState state = Blocks.AIR.getDefaultState();
            if (currentState == state) {
                world.playSoundFromEntity(null, user, SoundRegistry.ELEMENTAL_SWORD_EARTH_ATTACK_01.get(),
                        user.getSoundCategory(), 0.4f, 0.8f);
                BattleStandardEntity banner = EntityRegistry.BATTLESTANDARD.get().spawn(
                        world,
                        user.getBlockPos().up(height).offset(user.getMovementDirection(), distance),
                        SpawnReason.MOB_SUMMONED);
                if (banner != null) {
                    banner.setVelocity(0, -1, 0);
                    banner.ownerEntity = user;
                    banner.decayRate = decayRate;
                    banner.standardType = standardType;
                    banner.doesHealing = doesHealing;
                    banner.dealsDamage = dealsDamage;
                    banner.negativeEffect = negativeEffect;
                    banner.negativeEffectSecondary = negativeEffectSecondary;
                    banner.positiveEffect = positiveEffect;
                    banner.positiveEffectSecondary = positiveEffectSecondary;
                    banner.positiveEffectAmplifier = positiveEffectAmplifier;
                    banner.negativeEffectAmplifier = negativeEffectAmplifier;
                    banner.setCustomName(Text.translatable("entity.SimpleSwordAvaritia.battlestandard.name", user.getName()));
                    return banner;
                }
            }
        }
        return null;
    }

    // Gem Sockets
    // When each method is added to an item class, allows for gem sockets to appear on the item.
    // Each method needs to be called in its respective Override method. (Eg. inventoryTickGemSocketLogic goes in inventoryTick)

    // Performs postHit socket effects
    public static void postHitGemSocketLogic(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!attacker.getWorld().isClient()) {
            switch (stack.getOrCreateNbt().getString("runic_power")) {
                case "freeze" -> RunicMethods.postHitRunicFreeze(target, attacker);
                case "wildfire" -> RunicMethods.postHitRunicWildfire(target, attacker);
                case "slow" -> RunicMethods.postHitRunicSlow(target, attacker);
                case "greater_slow" -> RunicMethods.postHitRunicGreaterSlow(target, attacker);
                case "swiftness" -> RunicMethods.postHitRunicSwiftness(attacker);
                case "greater_swiftness" -> RunicMethods.postHitRunicGreaterSwiftness(attacker);
                case "float" -> RunicMethods.postHitRunicFloat(target, attacker);
                case "greater_float" -> RunicMethods.postHitRunicGreaterFloat(target, attacker);
                case "zephyr" -> RunicMethods.postHitRunicZephyr(attacker);
                case "greater_zephyr" -> RunicMethods.postHitRunicGreaterZephyr(attacker);
                case "shielding" -> RunicMethods.postHitRunicShielding(attacker);
                case "greater_shielding" -> RunicMethods.postHitRunicGreaterShielding(attacker);
                case "stoneskin" -> RunicMethods.postHitRunicStoneskin(attacker);
                case "greater_stoneskin" -> RunicMethods.postHitRunicGreaterStoneskin(attacker);
                case "trailblaze" -> RunicMethods.postHitRunicTrailblaze(attacker);
                case "greater_trailblaze" -> RunicMethods.postHitRunicGreaterTrailblaze(attacker);
                case "weaken" -> RunicMethods.postHitRunicWeaken(target, attacker);
                case "greater_weaken" -> RunicMethods.postHitRunicGreaterWeaken(target, attacker);
                case "imbued" -> RunicMethods.postHitRunicImbued(stack, target, attacker);
                case "greater_imbued" -> RunicMethods.postHitRunicGreaterImbued(stack, target, attacker);
                case "pincushion" -> RunicMethods.postHitRunicPinCushion(target, attacker);
                case "greater_pincushion" -> RunicMethods.postHitRunicGreaterPinCushion(target, attacker);
            }

            switch (stack.getOrCreateNbt().getString("nether_power")) {
                case "echo" -> RunicMethods.postHitNetherEcho(stack, target, attacker);
                case "berserk" -> RunicMethods.postHitNetherBerserk(stack, target, attacker);
                case "radiance" -> RunicMethods.postHitNetherRadiance(target, attacker);
                case "onslaught" -> RunicMethods.postHitNetherOnslaught(target, attacker);
                case "nullification" -> RunicMethods.postHitNetherNullification(attacker);
            }
        }
    }

    // Adds the relevant socket information to the item tooltip
    public static void appendTooltipGemSocketLogic(ItemStack itemStack, List<Text> tooltip) {

        Style RUNIC = HelperMethods.getStyle("runic");
        Style NETHERFUSED = HelperMethods.getStyle("legendary");
        Style TEXT = HelperMethods.getStyle("text");

        NbtCompound nbt = itemStack.getOrCreateNbt();
        if (!nbt.getString("runic_power").equals("no_socket") || !nbt.getString("nether_power").equals("no_socket")) {
            tooltip.add(Text.literal(""));
        }
        if (Screen.hasAltDown()) {
            if (nbt.getString("runic_power").contains("greater")) {
                tooltip.add(Text.translatable("item.SimpleSwordAvaritia.greater_runic_power").setStyle(RUNIC));
            }
            switch (nbt.getString("runic_power")) {
                case "socket_empty" ->
                        tooltip.add(Text.translatable("item.SimpleSwordAvaritia.empty_runic_slot").formatted(Formatting.GRAY));
                case "freeze" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.freeze").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.freezesworditem.tooltip2").setStyle(TEXT));
                }
                case "wildfire" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.wildfire").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.wildfiresworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.wildfiresworditem.tooltip3").setStyle(TEXT));
                }
                case "slow", "greater_slow" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.slow").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.slownesssworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.slownesssworditem.tooltip3").setStyle(TEXT));
                }
                case "swiftness", "greater_swiftness" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.swiftness").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.speedsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.speedsworditem.tooltip3").setStyle(TEXT));
                }
                case "float", "greater_float" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.float").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.levitationsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.levitationsworditem.tooltip3").setStyle(TEXT));
                }
                case "zephyr", "greater_zephyr" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.zephyr").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.zephyrsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.zephyrsworditem.tooltip3").setStyle(TEXT));
                }
                case "shielding", "greater_shielding" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.shielding").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.shieldingsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.shieldingsworditem.tooltip3").setStyle(TEXT));
                }
                case "stoneskin", "greater_stoneskin" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.stoneskin").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.stoneskinsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.stoneskinsworditem.tooltip3").setStyle(TEXT));
                }
                case "frost_ward" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.frost_ward").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.frostwardsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.frostwardsworditem.tooltip3").setStyle(TEXT));
                }
                case "trailblaze", "greater_trailblaze" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.trailblaze").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.trailblazesworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.trailblazesworditem.tooltip3").setStyle(TEXT));
                }
                case "active_defence" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.active_defence").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.activedefencesworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.activedefencesworditem.tooltip3").setStyle(TEXT));
                }
                case "weaken", "greater_weaken" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.weaken").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.weakensworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.weakensworditem.tooltip3").setStyle(TEXT));
                }
                case "unstable" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.unstable").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.unstablesworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.unstablesworditem.tooltip3").setStyle(TEXT));
                }
                case "imbued", "greater_imbued" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.imbued").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.imbuedsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.imbuedsworditem.tooltip3").setStyle(TEXT));
                }
                case "pincushion", "greater_pincushion" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.runefused_power.pincushion").setStyle(RUNIC));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.pincushionsworditem.tooltip2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.pincushionsworditem.tooltip3").setStyle(TEXT));
                }
            }

            if (!nbt.getString("runic_power").equals("no_socket") && !nbt.getString("nether_power").equals("no_socket")) {
                tooltip.add(Text.literal(""));
            }

            switch (nbt.getString("nether_power")) {
                case "socket_empty" ->
                        tooltip.add(Text.translatable("item.SimpleSwordAvaritia.empty_nether_slot").formatted(Formatting.GRAY));
                case "echo" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.echo").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.echo.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.echo.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.echo.description3").setStyle(TEXT));
                }
                case "berserk" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.berserk").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.berserk.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.berserk.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.berserk.description3").setStyle(TEXT));
                }
                case "radiance" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.radiance").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.radiance.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.radiance.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.radiance.description3").setStyle(TEXT));
                }
                case "onslaught" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description3").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description4").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description5").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.onslaught.description6").setStyle(TEXT));
                }
                case "nullification" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification.description3").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification.description4").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.nullification.description5").setStyle(TEXT));
                }
                case "precise" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.precise").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.precise.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.precise.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.precise.description3").setStyle(TEXT));
                }
                case "mighty" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.mighty").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.mighty.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.mighty.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.mighty.description3").setStyle(TEXT));
                }
                case "stealthy" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.stealthy").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.stealthy.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.stealthy.description2").setStyle(TEXT));
                }
                case "renewed" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.renewed").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.renewed.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.renewed.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.renewed.description3").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.renewed.description4").setStyle(TEXT));
                }
                case "accelerant" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.accelerant").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.accelerant.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.accelerant.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.accelerant.description3").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.accelerant.description4").setStyle(TEXT));
                }
                case "leaping" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.leaping").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.leaping.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.leaping.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.leaping.description3").setStyle(TEXT));
                }
                case "spellshield" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellshield").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellshield.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellshield.description2").setStyle(TEXT));
                }
                case "spellforged" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellforged").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellforged.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellforged.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellforged.description3").setStyle(TEXT));
                }
                case "soulshock" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.soulshock").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.soulshock.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.soulshock.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.soulshock.description3").setStyle(TEXT));
                }
                case "spell_standard" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellstandard").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellstandard.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellstandard.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.spellstandard.description3").setStyle(TEXT));
                }
                case "war_standard" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.warstandard").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.warstandard.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.warstandard.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.warstandard.description3").setStyle(TEXT));
                }
                case "deception" -> {
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.deception").setStyle(NETHERFUSED));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.deception.description").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.deception.description2").setStyle(TEXT));
                    tooltip.add(Text.translatable("item.SimpleSwordAvaritia.uniquesworditem.netherfused_power.deception.description3").setStyle(TEXT));
                }
            }
        } else if (!nbt.getString("runic_power").equals("no_socket") || !nbt.getString("nether_power").equals("no_socket")) {
            tooltip.add(Text.translatable("item.SimpleSwordAvaritia.common.showtooltip").formatted(Formatting.GRAY));
        }
    }

    // DISABLED: Gem socket logic - auxiliary items are not registered
    /*
    public static void onClickedGemSocketLogic (ItemStack stack, ItemStack otherStack, PlayerEntity player) {

        if (Config.getBoolean("enableUniqueGemSockets", "General", ConfigDefaultValues.enableUniqueGemSockets)) {
            String powerType = null;
            if (otherStack.isOf(ItemsRegistry.RUNEFUSED_GEM.get()) && stack.getOrCreateNbt().getString("runic_power").equals("socket_empty")
                    && !otherStack.getOrCreateNbt().getString("runic_power").isEmpty()) {
                powerType = "runic_power";
            } else if (otherStack.isOf(ItemsRegistry.NETHERFUSED_GEM.get()) && stack.getOrCreateNbt().getString("nether_power").equals("socket_empty")
                    && !otherStack.getOrCreateNbt().getString("nether_power").isEmpty()) {
                powerType = "nether_power";
            }
            if (powerType != null) {
                String powerSelection = otherStack.getOrCreateNbt().getString(powerType);
                stack.getOrCreateNbt().putString(powerType, powerSelection);
                player.getWorld().playSoundFromEntity(null, player, SoundEvents.BLOCK_ANVIL_USE, player.getSoundCategory(), 1, 1);
                otherStack.decrement(1);
            }
        }
    }
    */

    // DISABLED: Gem socket tick logic - auxiliary items are not registered
    /*
    public static void inventoryTickGemSocketLogic (ItemStack stack, World world, Entity entity,
                                                    int runeSocketChance, int netherSocketChance) {

        NbtCompound nbt = stack.getOrCreateNbt();

        if (nbt.getString("runic_power").isEmpty() && nbt.getString("nether_power").isEmpty() && Config.getBoolean("enableUniqueGemSockets", "General", ConfigDefaultValues.enableUniqueGemSockets)) {
            float socketChance = (float) (Math.random() * 100);
            float socketChance2 = (float) (Math.random() * 100);

            if (socketChance > runeSocketChance) nbt.putString("runic_power", "socket_empty");
            else nbt.putString("runic_power", "no_socket");
            if (socketChance2 > netherSocketChance) nbt.putString("nether_power", "socket_empty");
            else nbt.putString("nether_power", "no_socket");
        }
        if (!world.isClient && (entity instanceof LivingEntity user) &&
                (user.getEquippedStack(EquipmentSlot.MAINHAND) == stack || user.getEquippedStack(EquipmentSlot.OFFHAND) == stack)) {
            switch (stack.getOrCreateNbt().getString("runic_power")) {
                case "unstable" -> RunicMethods.inventoryTickRunicUnstable(user);
                case "active_defence" ->
                        RunicMethods.inventoryTickRunicActiveDefence(world, user);
                case "frost_ward" -> RunicMethods.inventoryTickRunicFrostWard(world, user);
            }
        }

    }
    */

}
