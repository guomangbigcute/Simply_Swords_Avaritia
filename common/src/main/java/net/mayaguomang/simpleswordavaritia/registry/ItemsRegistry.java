package net.mayaguomang.simpleswordavaritia.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Rarity;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.config.Config;
import net.mayaguomang.simpleswordavaritia.config.ConfigDefaultValues;
import net.mayaguomang.simpleswordavaritia.item.*;
// DISABLED: import net.mayaguomang.simpleswordavaritia.item.custom.*; // All UNIQUE sword items are disabled

public class ItemsRegistry {

    static float iron_modifier = Config.getFloat("iron_damageModifier", "WeaponAttributes", ConfigDefaultValues.iron_damageModifier);
    static float gold_modifier = Config.getFloat("gold_damageModifier", "WeaponAttributes", ConfigDefaultValues.gold_damageModifier);
    static float diamond_modifier = Config.getFloat("diamond_damageModifier", "WeaponAttributes", ConfigDefaultValues.diamond_damageModifier);
    static float netherite_modifier = Config.getFloat("netherite_damageModifier", "WeaponAttributes", ConfigDefaultValues.netherite_damageModifier);
    static float runic_modifier = Config.getFloat("runic_damageModifier", "WeaponAttributes", ConfigDefaultValues.runic_damageModifier);


    static float longsword_positive_modifier = Config.getFloat("longsword_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.longsword_positiveDamageModifier);
    static float twinblade_positive_modifier = Config.getFloat("twinblade_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.twinblade_positiveDamageModifier);
    static float rapier_positive_modifier = Config.getFloat("rapier_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.rapier_positiveDamageModifier);
    static float katana_positive_modifier = Config.getFloat("katana_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.katana_positiveDamageModifier);
    static float sai_positive_modifier = Config.getFloat("sai_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.sai_positiveDamageModifier);
    static float spear_positive_modifier = Config.getFloat("spear_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.spear_positiveDamageModifier);
    static float glaive_positive_modifier = Config.getFloat("glaive_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.glaive_positiveDamageModifier);
    static float warglaive_positive_modifier = Config.getFloat("warglaive_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.warglaive_positiveDamageModifier);
    static float cutlass_positive_modifier = Config.getFloat("cutlass_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.cutlass_positiveDamageModifier);
    static float claymore_positive_modifier = Config.getFloat("claymore_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.claymore_positiveDamageModifier);
    static float greataxe_positive_modifier = Config.getFloat("greataxe_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.greataxe_positiveDamageModifier);
    static float greathammer_positive_modifier = Config.getFloat("greathammer_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.greathammer_positiveDamageModifier);
    static float chakram_positive_modifier = Config.getFloat("chakram_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.chakram_positiveDamageModifier);
    static float scythe_positive_modifier = Config.getFloat("scythe_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.scythe_positiveDamageModifier);
    static float halberd_positive_modifier = Config.getFloat("halberd_positiveDamageModifier", "WeaponAttributes", ConfigDefaultValues.halberd_positiveDamageModifier);

    static float longsword_negative_modifier = Config.getFloat("longsword_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.longsword_negativeDamageModifier);
    static float twinblade_negative_modifier = Config.getFloat("twinblade_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.twinblade_negativeDamageModifier);
    static float rapier_negative_modifier = Config.getFloat("rapier_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.rapier_negativeDamageModifier);
    static float sai_negative_modifier = Config.getFloat("sai_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.sai_negativeDamageModifier);
    static float spear_negative_modifier = Config.getFloat("spear_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.spear_negativeDamageModifier);
    static float katana_negative_modifier = Config.getFloat("katana_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.katana_negativeDamageModifier);
    static float glaive_negative_modifier = Config.getFloat("glaive_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.glaive_negativeDamageModifier);
    static float warglaive_negative_modifier = Config.getFloat("warglaive_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.warglaive_negativeDamageModifier);
    static float cutlass_negative_modifier = Config.getFloat("cutlass_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.cutlass_negativeDamageModifier);
    static float claymore_negative_modifier = Config.getFloat("claymore_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.claymore_negativeDamageModifier);
    static float greataxe_negative_modifier = Config.getFloat("greataxe_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.greataxe_negativeDamageModifier);
    static float greathammer_negative_modifier = Config.getFloat("greathammer_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.greathammer_negativeDamageModifier);
    static float chakram_negative_modifier = Config.getFloat("chakram_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.chakram_negativeDamageModifier);
    static float scythe_negative_modifier = Config.getFloat("scythe_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.scythe_negativeDamageModifier);
    static float halberd_negative_modifier = Config.getFloat("halberd_negativeDamageModifier", "WeaponAttributes", ConfigDefaultValues.halberd_negativeDamageModifier);

    static float longsword_attackspeed = Config.getFloat("longsword_attackSpeed", "WeaponAttributes", ConfigDefaultValues.longsword_attackSpeed);
    static float twinblade_attackspeed = Config.getFloat("twinblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.twinblade_attackSpeed);
    static float rapier_attackspeed = Config.getFloat("rapier_attackSpeed", "WeaponAttributes", ConfigDefaultValues.rapier_attackSpeed);
    static float sai_attackspeed = Config.getFloat("sai_attackSpeed", "WeaponAttributes", ConfigDefaultValues.sai_attackSpeed);
    static float spear_attackspeed = Config.getFloat("spear_attackSpeed", "WeaponAttributes", ConfigDefaultValues.spear_attackSpeed);
    static float katana_attackspeed = Config.getFloat("katana_attackSpeed", "WeaponAttributes", ConfigDefaultValues.katana_attackSpeed);
    static float glaive_attackspeed = Config.getFloat("glaive_attackSpeed", "WeaponAttributes", ConfigDefaultValues.glaive_attackSpeed);
    static float warglaive_attackspeed = Config.getFloat("warglaive_attackSpeed", "WeaponAttributes", ConfigDefaultValues.warglaive_attackSpeed);
    static float cutlass_attackspeed = Config.getFloat("cutlass_attackSpeed", "WeaponAttributes", ConfigDefaultValues.cutlass_attackSpeed);
    static float claymore_attackspeed = Config.getFloat("claymore_attackSpeed", "WeaponAttributes", ConfigDefaultValues.claymore_attackSpeed);
    static float greataxe_attackspeed = Config.getFloat("greataxe_attackSpeed", "WeaponAttributes", ConfigDefaultValues.greataxe_attackSpeed);
    static float greathammer_attackspeed = Config.getFloat("greathammer_attackSpeed", "WeaponAttributes", ConfigDefaultValues.greathammer_attackSpeed);
    static float chakram_attackspeed = Config.getFloat("chakram_attackSpeed", "WeaponAttributes", ConfigDefaultValues.chakram_attackSpeed);
    static float scythe_attackspeed = Config.getFloat("scythe_attackSpeed", "WeaponAttributes", ConfigDefaultValues.scythe_attackSpeed);
    static float halberd_attackspeed = Config.getFloat("halberd_attackSpeed", "WeaponAttributes", ConfigDefaultValues.halberd_attackSpeed);

    static float brimstone_attackspeed = Config.getFloat("brimstone_attackSpeed", "WeaponAttributes", ConfigDefaultValues.brimstone_attackSpeed);
    static float thewatcher_attackspeed = Config.getFloat("thewatcher_attackSpeed", "WeaponAttributes", ConfigDefaultValues.thewatcher_attackSpeed);
    static float stormsedge_attackspeed = Config.getFloat("stormsedge_attackSpeed", "WeaponAttributes", ConfigDefaultValues.stormsedge_attackSpeed);
    static float stormbringer_attackspeed = Config.getFloat("stormbringer_attackSpeed", "WeaponAttributes", ConfigDefaultValues.stormbringer_attackSpeed);
    static float swordonastick_attackspeed = Config.getFloat("swordonastick_attackSpeed", "WeaponAttributes", ConfigDefaultValues.swordonastick_attackSpeed);
    static float bramblethorn_attackspeed = Config.getFloat("bramblethorn_attackSpeed", "WeaponAttributes", ConfigDefaultValues.bramblethorn_attackSpeed);
    static float watchingwarglaive_attackspeed = Config.getFloat("watchingwarglaive_attackSpeed", "WeaponAttributes", ConfigDefaultValues.watchingwarglaive_attackSpeed);
    static float longswordofplague_attackspeed = Config.getFloat("longswordofplague_attackSpeed", "WeaponAttributes", ConfigDefaultValues.longswordofplague_attackSpeed);
    static float emberblade_attackspeed = Config.getFloat("emberblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.emberblade_attackSpeed);
    static float hearthflame_attackspeed = Config.getFloat("hearthflame_attackSpeed", "WeaponAttributes", ConfigDefaultValues.hearthflame_attackSpeed);
    static float soulkeeper_attackspeed = Config.getFloat("soulkeeper_attackSpeed", "WeaponAttributes", ConfigDefaultValues.soulkeeper_attackSpeed);
    static float twistedblade_attackspeed = Config.getFloat("twistedblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.twistedblade_attackSpeed);
    static float soulstealer_attackspeed = Config.getFloat("soulstealer_attackSpeed", "WeaponAttributes", ConfigDefaultValues.soulstealer_attackSpeed);
    static float soulrender_attackspeed = Config.getFloat("soulrender_attackSpeed", "WeaponAttributes", ConfigDefaultValues.soulrender_attackSpeed);
    static float mjolnir_attackspeed = Config.getFloat("mjolnir_attackSpeed", "WeaponAttributes", ConfigDefaultValues.mjolnir_attackSpeed);
    static float soulpyre_attackspeed = Config.getFloat("soulpyre_attackSpeed", "WeaponAttributes", ConfigDefaultValues.soulpyre_attackSpeed);
    static float frostfall_attackspeed = Config.getFloat("frostfall_attackSpeed", "WeaponAttributes", ConfigDefaultValues.frostfall_attackSpeed);
    static float moltenedge_attackspeed = Config.getFloat("moltenedge_attackSpeed", "WeaponAttributes", ConfigDefaultValues.moltenedge_attackSpeed);
    static float livyatan_attackspeed = Config.getFloat("livyatan_attackSpeed", "WeaponAttributes", ConfigDefaultValues.livyatan_attackSpeed);
    static float icewhisper_attackspeed = Config.getFloat("icewhisper_attackSpeed", "WeaponAttributes", ConfigDefaultValues.icewhisper_attackSpeed);
    static float arcanethyst_attackspeed = Config.getFloat("arcanethyst_attackSpeed", "WeaponAttributes", ConfigDefaultValues.arcanethyst_attackSpeed);
    static float thunderbrand_attackspeed = Config.getFloat("thunderbrand_attackSpeed", "WeaponAttributes", ConfigDefaultValues.thunderbrand_attackSpeed);
    static float lichblade_attackspeed = Config.getFloat("lichblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.lichblade_attackSpeed);
    static float shadowsting_attackspeed = Config.getFloat("shadowsting_attackSpeed", "WeaponAttributes", ConfigDefaultValues.shadowsting_attackSpeed);
    static float sunfire_attackspeed = Config.getFloat("sunfire_attackSpeed", "WeaponAttributes", ConfigDefaultValues.sunfire_attackSpeed);
    static float harbinger_attackspeed = Config.getFloat("harbinger_attackSpeed", "WeaponAttributes", ConfigDefaultValues.harbinger_attackSpeed);
    static float whisperwind_attackspeed = Config.getFloat("whisperwind_attackSpeed", "WeaponAttributes", ConfigDefaultValues.whisperwind_attackSpeed);
    static float emberlash_attackspeed = Config.getFloat("emberlash_attackSpeed", "WeaponAttributes", ConfigDefaultValues.emberlash_attackSpeed);
    static float waxweaver_attackspeed = Config.getFloat("waxweaver_attackSpeed", "WeaponAttributes", ConfigDefaultValues.waxweaver_attackSpeed);
    static float hiveheart_attackspeed = Config.getFloat("hiveheart_attackSpeed", "WeaponAttributes", ConfigDefaultValues.hiveheart_attackSpeed);
    static float starsedge_attackspeed = Config.getFloat("starsedge_attackSpeed", "WeaponAttributes", ConfigDefaultValues.starsedge_attackSpeed);
    static float wickpiercer_attackspeed = Config.getFloat("wickpiercer_attackSpeed", "WeaponAttributes", ConfigDefaultValues.wickpiercer_attackSpeed);
    static float tempest_attackspeed = Config.getFloat("tempest_attackSpeed", "WeaponAttributes", ConfigDefaultValues.tempest_attackSpeed);
    static float flamewind_attackspeed = Config.getFloat("flamewind_attackSpeed", "WeaponAttributes", ConfigDefaultValues.flamewind_attackSpeed);
    static float ribboncleaver_attackspeed = Config.getFloat("ribboncleaver_attackSpeed", "WeaponAttributes", ConfigDefaultValues.ribboncleaver_attackSpeed);
    static float magiscythe_attackspeed = Config.getFloat("magiscythe_attackSpeed", "WeaponAttributes", ConfigDefaultValues.magiscythe_attackSpeed);
    static float enigma_attackspeed = Config.getFloat("enigma_attackSpeed", "WeaponAttributes", ConfigDefaultValues.enigma_attackSpeed);
    static float magispear_attackspeed = Config.getFloat("magispear_attackSpeed", "WeaponAttributes", ConfigDefaultValues.magispear_attackSpeed);
    static float magiblade_attackspeed = Config.getFloat("magiblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.magiblade_attackSpeed);
    static float caelestis_attackspeed = Config.getFloat("caelestis_attackSpeed", "WeaponAttributes", ConfigDefaultValues.caelestis_attackSpeed);



    static float brimstone_damage_modifier = Config.getFloat("brimstone_damageModifier", "WeaponAttributes", ConfigDefaultValues.brimstone_damageModifier);
    static float thewatcher_damage_modifier = Config.getFloat("thewatcher_damageModifier", "WeaponAttributes", ConfigDefaultValues.thewatcher_damageModifier);
    static float stormsedge_damage_modifier = Config.getFloat("stormsedge_damageModifier", "WeaponAttributes", ConfigDefaultValues.stormsedge_damageModifier);
    static float stormbringer_damage_modifier = Config.getFloat("stormbringer_damageModifier", "WeaponAttributes", ConfigDefaultValues.stormbringer_damageModifier);
    static float swordonastick_damage_modifier = Config.getFloat("swordonastick_damageModifier", "WeaponAttributes", ConfigDefaultValues.swordonastick_damageModifier);
    static float bramblethorn_damage_modifier = Config.getFloat("bramblethorn_damageModifier", "WeaponAttributes", ConfigDefaultValues.bramblethorn_damageModifier);
    static float watchingwarglaive_damage_modifier = Config.getFloat("watchingwarglaive_damageModifier", "WeaponAttributes", ConfigDefaultValues.watchingwarglaive_damageModifier);
    static float longswordofplague_damage_modifier = Config.getFloat("longswordofplague_damageModifier", "WeaponAttributes", ConfigDefaultValues.longswordofplague_damageModifier);
    static float emberblade_damage_modifier = Config.getFloat("emberblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.emberblade_damageModifier);
    static float hearthflame_damage_modifier = Config.getFloat("hearthflame_damageModifier", "WeaponAttributes", ConfigDefaultValues.hearthflame_damageModifier);
    static float soulkeeper_damage_modifier = Config.getFloat("soulkeeper_damageModifier", "WeaponAttributes", ConfigDefaultValues.soulkeeper_damageModifier);
    static float twistedblade_damage_modifier = Config.getFloat("twistedblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.twistedblade_damageModifier);
    static float soulstealer_damage_modifier = Config.getFloat("soulstealer_damageModifier", "WeaponAttributes", ConfigDefaultValues.soulstealer_damageModifier);
    static float soulrender_damage_modifier = Config.getFloat("soulrender_damageModifier", "WeaponAttributes", ConfigDefaultValues.soulrender_damageModifier);
    static float mjolnir_damage_modifier = Config.getFloat("mjolnir_damageModifier", "WeaponAttributes", ConfigDefaultValues.mjolnir_damageModifier);
    static float soulpyre_damage_modifier = Config.getFloat("soulpyre_damageModifier", "WeaponAttributes", ConfigDefaultValues.soulpyre_damageModifier);
    static float frostfall_damage_modifier = Config.getFloat("frostfall_damageModifier", "WeaponAttributes", ConfigDefaultValues.frostfall_damageModifier);
    static float moltenedge_damage_modifier = Config.getFloat("moltenedge_damageModifier", "WeaponAttributes", ConfigDefaultValues.moltenedge_damageModifier);
    static float livyatan_damage_modifier = Config.getFloat("livyatan_damageModifier", "WeaponAttributes", ConfigDefaultValues.livyatan_damageModifier);
    static float icewhisper_damage_modifier = Config.getFloat("icewhisper_damageModifier", "WeaponAttributes", ConfigDefaultValues.icewhisper_damageModifier);
    static float arcanethyst_damage_modifier = Config.getFloat("arcanethyst_damageModifier", "WeaponAttributes", ConfigDefaultValues.arcanethyst_damageModifier);
    static float thunderbrand_damage_modifier = Config.getFloat("thunderbrand_damageModifier", "WeaponAttributes", ConfigDefaultValues.thunderbrand_damageModifier);
    static float lichblade_damage_modifier = Config.getFloat("lichblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.lichblade_damageModifier);
    static float shadowsting_damage_modifier = Config.getFloat("shadowsting_damageModifier", "WeaponAttributes", ConfigDefaultValues.shadowsting_damageModifier);
    static float sunfire_damage_modifier = Config.getFloat("sunfire_damageModifier", "WeaponAttributes", ConfigDefaultValues.sunfire_damageModifier);
    static float harbinger_damage_modifier = Config.getFloat("harbinger_damageModifier", "WeaponAttributes", ConfigDefaultValues.harbinger_damageModifier);
    static float whisperwind_damage_modifier = Config.getFloat("whisperwind_damageModifier", "WeaponAttributes", ConfigDefaultValues.whisperwind_damageModifier);
    static float emberlash_damage_modifier = Config.getFloat("emberlash_damageModifier", "WeaponAttributes", ConfigDefaultValues.emberlash_damageModifier);
    static float waxweaver_damage_modifier = Config.getFloat("waxweaver_damageModifier", "WeaponAttributes", ConfigDefaultValues.waxweaver_damageModifier);
    static float hiveheart_damage_modifier = Config.getFloat("hiveheart_damageModifier", "WeaponAttributes", ConfigDefaultValues.hiveheart_damageModifier);
    static float starsedge_damage_modifier = Config.getFloat("starsedge_damageModifier", "WeaponAttributes", ConfigDefaultValues.starsedge_damageModifier);
    static float wickpiercer_damage_modifier = Config.getFloat("wickpiercer_damageModifier", "WeaponAttributes", ConfigDefaultValues.wickpiercer_damageModifier);
    static float tempest_damage_modifier = Config.getFloat("tempest_damageModifier", "WeaponAttributes", ConfigDefaultValues.tempest_damageModifier);
    static float flamewind_damage_modifier = Config.getFloat("flamewind_damageModifier", "WeaponAttributes", ConfigDefaultValues.flamewind_damageModifier);
    static float ribboncleaver_damage_modifier = Config.getFloat("ribboncleaver_damageModifier", "WeaponAttributes", ConfigDefaultValues.ribboncleaver_damageModifier);
    static float magiscythe_damage_modifier = Config.getFloat("magiscythe_damageModifier", "WeaponAttributes", ConfigDefaultValues.magiscythe_damageModifier);
    static float enigma_damage_modifier = Config.getFloat("enigma_damageModifier", "WeaponAttributes", ConfigDefaultValues.enigma_damageModifier);
    static float magispear_damage_modifier = Config.getFloat("magispear_damageModifier", "WeaponAttributes", ConfigDefaultValues.magispear_damageModifier);
    static float magiblade_damage_modifier = Config.getFloat("magiblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.magiblade_damageModifier);
    static float caelestis_damage_modifier = Config.getFloat("caelestis_damageModifier", "WeaponAttributes", ConfigDefaultValues.caelestis_damageModifier);


    public static final DeferredRegister<Item> ITEM = DeferredRegister.create(SimpleSwordAvaritia.MOD_ID, RegistryKeys.ITEM);


    // DISABLED: Auxiliary items registration removed - not needed for Infinity series only
    /*
    public static final RegistrySupplier<RunicTabletItem> RUNIC_TABLET = ITEM.register("runic_tablet", RunicTabletItem::new);
    public static final RegistrySupplier<RunefusedGemItem> RUNEFUSED_GEM = ITEM.register("runefused_gem", RunefusedGemItem::new);
    public static final RegistrySupplier<NetherfusedGemItem> NETHERFUSED_GEM = ITEM.register("netherfused_gem", NetherfusedGemItem::new);
    public static final RegistrySupplier<EmpoweredRemnantItem> EMPOWERED_REMNANT = ITEM.register("empowered_remnant", EmpoweredRemnantItem::new);
    public static final RegistrySupplier<ContainedRemnantItem> CONTAINED_REMNANT = ITEM.register("contained_remnant", ContainedRemnantItem::new);
    public static final RegistrySupplier<ContainedRemnantItem> TAMPERED_REMNANT = ITEM.register("tampered_remnant", ContainedRemnantItem::new);
    */

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_LONGSWORD = ITEM.register("iron_longsword", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + longsword_positive_modifier - longsword_negative_modifier),
// DISABLED:                                         longsword_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_TWINBLADE = ITEM.register( "iron_twinblade", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
// DISABLED:                                         twinblade_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_RAPIER = ITEM.register( "iron_rapier", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + rapier_positive_modifier - rapier_negative_modifier),
// DISABLED:                                         rapier_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_KATANA = ITEM.register( "iron_katana", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + katana_positive_modifier - katana_negative_modifier),
// DISABLED:                                         katana_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_SAI = ITEM.register( "iron_sai", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + sai_positive_modifier - sai_negative_modifier),
// DISABLED:                                         sai_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_SPEAR = ITEM.register( "iron_spear", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + spear_positive_modifier - spear_negative_modifier),
// DISABLED:                                         spear_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_GLAIVE = ITEM.register( "iron_glaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + glaive_positive_modifier - glaive_negative_modifier),
// DISABLED:                                         glaive_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_WARGLAIVE = ITEM.register( "iron_warglaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
// DISABLED:                                         warglaive_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_CUTLASS = ITEM.register( "iron_cutlass", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
// DISABLED:                                         cutlass_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_CLAYMORE = ITEM.register( "iron_claymore", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + claymore_positive_modifier - claymore_negative_modifier),
// DISABLED:                                         claymore_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_GREATHAMMER = ITEM.register( "iron_greathammer", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
// DISABLED:                                         greathammer_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_GREATAXE = ITEM.register( "iron_greataxe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
// DISABLED:                                         greataxe_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_CHAKRAM = ITEM.register( "iron_chakram", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + chakram_positive_modifier - chakram_negative_modifier),
// DISABLED:                                         chakram_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_SCYTHE = ITEM.register( "iron_scythe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + scythe_positive_modifier - scythe_negative_modifier),
// DISABLED:                                         scythe_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> IRON_HALBERD = ITEM.register( "iron_halberd", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.IRON,
// DISABLED:                     (int) (iron_modifier + halberd_positive_modifier - halberd_negative_modifier),
// DISABLED:                                         halberd_attackspeed,
// DISABLED:                     "minecraft:iron_ingot"));

    //GOLD
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_LONGSWORD = ITEM.register( "gold_longsword", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + longsword_positive_modifier - longsword_negative_modifier),
// DISABLED:                                         longsword_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_TWINBLADE = ITEM.register( "gold_twinblade", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
// DISABLED:                                         twinblade_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_RAPIER = ITEM.register( "gold_rapier", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + rapier_positive_modifier - rapier_negative_modifier),
// DISABLED:                                         rapier_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_KATANA = ITEM.register( "gold_katana", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + katana_positive_modifier - katana_negative_modifier),
// DISABLED:                                         katana_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_SAI = ITEM.register( "gold_sai", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + sai_positive_modifier - sai_negative_modifier),
// DISABLED:                                         sai_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_SPEAR = ITEM.register( "gold_spear", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + spear_positive_modifier - spear_negative_modifier),
// DISABLED:                                         spear_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_GLAIVE = ITEM.register( "gold_glaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + glaive_positive_modifier - glaive_negative_modifier),
// DISABLED:                                         glaive_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_WARGLAIVE = ITEM.register( "gold_warglaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
// DISABLED:                                         warglaive_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_CUTLASS = ITEM.register( "gold_cutlass", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
// DISABLED:                                         cutlass_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_CLAYMORE = ITEM.register( "gold_claymore", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + claymore_positive_modifier - claymore_negative_modifier),
// DISABLED:                                         claymore_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_GREATHAMMER = ITEM.register( "gold_greathammer", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
// DISABLED:                                         greathammer_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_GREATAXE = ITEM.register( "gold_greataxe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
// DISABLED:                                         greataxe_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_CHAKRAM = ITEM.register( "gold_chakram", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + chakram_positive_modifier - chakram_negative_modifier),
// DISABLED:                                         chakram_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_SCYTHE = ITEM.register( "gold_scythe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + scythe_positive_modifier - scythe_negative_modifier),
// DISABLED:                                         scythe_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> GOLD_HALBERD = ITEM.register( "gold_halberd", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.GOLD,
// DISABLED:                     (int) (gold_modifier + halberd_positive_modifier - halberd_negative_modifier),
// DISABLED:                                         halberd_attackspeed,
// DISABLED:                     "minecraft:gold_ingot"));

    //DIAMOND
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_LONGSWORD = ITEM.register( "diamond_longsword", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + longsword_positive_modifier - longsword_negative_modifier),
// DISABLED:                                         longsword_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_TWINBLADE = ITEM.register( "diamond_twinblade", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
// DISABLED:                                         twinblade_attackspeed,
// DISABLED:                     "minecraft:diamond"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_RAPIER = ITEM.register( "diamond_rapier", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + rapier_positive_modifier - rapier_negative_modifier),
// DISABLED:                                         rapier_attackspeed,
// DISABLED:                     "minecraft:diamond"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_KATANA = ITEM.register( "diamond_katana", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + katana_positive_modifier - katana_negative_modifier),
// DISABLED:                                         katana_attackspeed,
// DISABLED:                     "minecraft:diamond"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_SAI = ITEM.register( "diamond_sai", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + sai_positive_modifier - sai_negative_modifier),
// DISABLED:                                         sai_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_SPEAR = ITEM.register( "diamond_spear", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + spear_positive_modifier - spear_negative_modifier),
// DISABLED:                                         spear_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_GLAIVE = ITEM.register( "diamond_glaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + glaive_positive_modifier - glaive_negative_modifier),
// DISABLED:                                         glaive_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_WARGLAIVE = ITEM.register( "diamond_warglaive", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
// DISABLED:                                         warglaive_attackspeed,
// DISABLED:                     "minecraft:diamond"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_CUTLASS = ITEM.register( "diamond_cutlass", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
// DISABLED:                                         cutlass_attackspeed,
// DISABLED:                     "minecraft:diamond"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_CLAYMORE = ITEM.register( "diamond_claymore", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + claymore_positive_modifier - claymore_negative_modifier),
// DISABLED:                                         claymore_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_GREATHAMMER = ITEM.register( "diamond_greathammer", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
// DISABLED:                                         greathammer_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_GREATAXE = ITEM.register( "diamond_greataxe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
// DISABLED:                                         greataxe_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_CHAKRAM = ITEM.register( "diamond_chakram", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + chakram_positive_modifier - chakram_negative_modifier),
// DISABLED:                                         chakram_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_SCYTHE = ITEM.register( "diamond_scythe", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + scythe_positive_modifier - scythe_negative_modifier),
// DISABLED:                                         scythe_attackspeed,
// DISABLED:                     "minecraft:diamond"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> DIAMOND_HALBERD = ITEM.register( "diamond_halberd", () ->
// DISABLED:             new SimpleSwordAvaritiaSwordItem(
// DISABLED:                     ToolMaterials.DIAMOND,
// DISABLED:                     (int) (diamond_modifier + halberd_positive_modifier - halberd_negative_modifier),
// DISABLED:                                         halberd_attackspeed,
// DISABLED:                     "minecraft:diamond"));

    //NETHERITE

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_LONGSWORD = ITEM.register( "netherite_longsword", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + longsword_positive_modifier - longsword_negative_modifier),
// DISABLED:                                         longsword_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_TWINBLADE = ITEM.register( "netherite_twinblade", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
// DISABLED:                                         twinblade_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_RAPIER = ITEM.register( "netherite_rapier", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (iron_modifier + rapier_positive_modifier - rapier_negative_modifier),
// DISABLED:                                         rapier_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_KATANA = ITEM.register( "netherite_katana", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + katana_positive_modifier - katana_negative_modifier),
// DISABLED:                                         katana_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));
// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_SAI = ITEM.register( "netherite_sai", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + sai_positive_modifier - sai_negative_modifier),
// DISABLED:                                         sai_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_SPEAR = ITEM.register( "netherite_spear", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + spear_positive_modifier - spear_negative_modifier),
// DISABLED:                                         spear_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_GLAIVE = ITEM.register( "netherite_glaive", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + glaive_positive_modifier - glaive_negative_modifier),
// DISABLED:                                         glaive_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_WARGLAIVE = ITEM.register( "netherite_warglaive", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
// DISABLED:                                         warglaive_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_CUTLASS = ITEM.register( "netherite_cutlass", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
// DISABLED:                                         cutlass_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_CLAYMORE = ITEM.register( "netherite_claymore", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + claymore_positive_modifier - claymore_negative_modifier),
// DISABLED:                                         claymore_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_GREATHAMMER = ITEM.register( "netherite_greathammer", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
// DISABLED:                                         greathammer_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_GREATAXE = ITEM.register( "netherite_greataxe", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
// DISABLED:                                         greataxe_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_CHAKRAM = ITEM.register( "netherite_chakram", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + chakram_positive_modifier - chakram_negative_modifier),
// DISABLED:                                         chakram_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_SCYTHE = ITEM.register( "netherite_scythe", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + scythe_positive_modifier - scythe_negative_modifier),
// DISABLED:                                         scythe_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));

// DISABLED:     public static final RegistrySupplier<SimpleSwordAvaritiaNetheriteSwordItem> NETHERITE_HALBERD = ITEM.register( "netherite_halberd", () ->
// DISABLED:             new SimpleSwordAvaritiaNetheriteSwordItem(
// DISABLED:                     ToolMaterials.NETHERITE,
// DISABLED:                     (int) (netherite_modifier + halberd_positive_modifier - halberd_negative_modifier),
// DISABLED:                                         halberd_attackspeed,
// DISABLED:                     "minecraft:netherite_ingot"));


    //RUNIC
// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_LONGSWORD = ITEM.register( "runic_longsword", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + longsword_positive_modifier - longsword_negative_modifier),
// DISABLED:                                         longsword_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_TWINBLADE = ITEM.register( "runic_twinblade", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + twinblade_positive_modifier - twinblade_negative_modifier),
// DISABLED:                                         twinblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_RAPIER = ITEM.register( "runic_rapier", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + rapier_positive_modifier - rapier_negative_modifier),
// DISABLED:                                         rapier_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_KATANA = ITEM.register( "runic_katana", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + katana_positive_modifier - katana_negative_modifier),
// DISABLED:                                         katana_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_SAI = ITEM.register( "runic_sai", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + sai_positive_modifier - sai_negative_modifier),
// DISABLED:                                         sai_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_SPEAR = ITEM.register( "runic_spear", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + spear_positive_modifier - spear_negative_modifier),
// DISABLED:                                         spear_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_GLAIVE = ITEM.register( "runic_glaive", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + glaive_positive_modifier - glaive_negative_modifier),
// DISABLED:                                         glaive_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_CUTLASS = ITEM.register( "runic_cutlass", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + cutlass_positive_modifier - cutlass_negative_modifier),
// DISABLED:                                         cutlass_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));
// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_CLAYMORE = ITEM.register( "runic_claymore", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + claymore_positive_modifier - claymore_negative_modifier),
// DISABLED:                                         claymore_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_CHAKRAM = ITEM.register( "runic_chakram", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + chakram_positive_modifier - chakram_negative_modifier),
// DISABLED:                                         chakram_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_GREATAXE = ITEM.register( "runic_greataxe", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + greataxe_positive_modifier - greataxe_negative_modifier),
// DISABLED:                                         greataxe_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_GREATHAMMER = ITEM.register( "runic_greathammer", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + greathammer_positive_modifier - greathammer_negative_modifier),
// DISABLED:                                         greathammer_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));
// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_WARGLAIVE = ITEM.register( "runic_warglaive", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + warglaive_positive_modifier - warglaive_negative_modifier),
// DISABLED:                                         warglaive_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_SCYTHE = ITEM.register( "runic_scythe", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + scythe_positive_modifier - scythe_negative_modifier),
// DISABLED:                                         scythe_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

// DISABLED:     public static final RegistrySupplier<RunicSwordItem> RUNIC_HALBERD = ITEM.register( "runic_halberd", () ->
// DISABLED:             new RunicSwordItem(ModToolMaterial.RUNIC,
// DISABLED:                     (int) (runic_modifier + halberd_positive_modifier - halberd_negative_modifier),
// DISABLED:                                         halberd_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.RARE)));

    //SPECIAL
// DISABLED:     public static final RegistrySupplier<FireSwordItem> BRIMSTONE_CLAYMORE = ITEM.register( "brimstone_claymore", () ->
// DISABLED:             new FireSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (brimstone_damage_modifier),
// DISABLED:                                         brimstone_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<WatcherSwordItem> WATCHER_CLAYMORE = ITEM.register( "watcher_claymore", () ->
// DISABLED:             new WatcherSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (thewatcher_damage_modifier),
// DISABLED:                                         thewatcher_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<StormsEdgeSwordItem> STORMS_EDGE = ITEM.register( "storms_edge", () ->
// DISABLED:             new StormsEdgeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (stormsedge_damage_modifier),
// DISABLED:                                         stormsedge_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<StormbringerSwordItem> STORMBRINGER = ITEM.register( "stormbringer", () ->
// DISABLED:             new StormbringerSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (stormbringer_damage_modifier),
// DISABLED:                                         stormbringer_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<SwordItem> SWORD_ON_A_STICK = ITEM.register( "sword_on_a_stick", () ->
// DISABLED:             new SwordItem(ToolMaterials.WOOD,
// DISABLED:                     (int) (swordonastick_damage_modifier),
// DISABLED:                                         swordonastick_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC)));

// DISABLED:     public static final RegistrySupplier<BrambleSwordItem> BRAMBLETHORN = ITEM.register( "bramblethorn", () ->
// DISABLED:             new BrambleSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (bramblethorn_damage_modifier),
// DISABLED:                                         bramblethorn_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<WatcherSwordItem> WATCHING_WARGLAIVE = ITEM.register( "watching_warglaive", () ->
// DISABLED:             new WatcherSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (watchingwarglaive_damage_modifier),
// DISABLED:                                         watchingwarglaive_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));
// DISABLED:     public static final RegistrySupplier<PlagueSwordItem> TOXIC_LONGSWORD = ITEM.register( "toxic_longsword", () ->
// DISABLED:             new PlagueSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (longswordofplague_damage_modifier),
// DISABLED:                                         longswordofplague_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<EmberIreSwordItem> EMBERBLADE = ITEM.register( "emberblade", () ->
// DISABLED:             new EmberIreSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (emberblade_damage_modifier),
// DISABLED:                                         emberblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<VolcanicFurySwordItem> HEARTHFLAME = ITEM.register( "hearthflame", () ->
// DISABLED:             new VolcanicFurySwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (hearthflame_damage_modifier),
// DISABLED:                                         hearthflame_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<SoulSwordItem> SOULKEEPER = ITEM.register( "soulkeeper", () ->
// DISABLED:             new SoulSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (soulkeeper_damage_modifier),
// DISABLED:                                         soulkeeper_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<HasteSwordItem> TWISTED_BLADE = ITEM.register( "twisted_blade", () ->
// DISABLED:             new HasteSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (twistedblade_damage_modifier),
// DISABLED:                                         twistedblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<StealSwordItem> SOULSTEALER = ITEM.register("soulstealer", () ->
// DISABLED:             new StealSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (soulstealer_damage_modifier),
// DISABLED:                                         soulstealer_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<RendSwordItem> SOULRENDER = ITEM.register( "soulrender", () ->
// DISABLED:             new RendSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (soulrender_damage_modifier),
// DISABLED:                                         soulrender_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<SoulPyreSwordItem> SOULPYRE = ITEM.register( "soulpyre", () ->
// DISABLED:             new SoulPyreSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (soulpyre_damage_modifier),
// DISABLED:                                         soulpyre_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<FrostfallSwordItem> FROSTFALL = ITEM.register( "frostfall", () ->
// DISABLED:             new FrostfallSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (frostfall_damage_modifier),
// DISABLED:                                         frostfall_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<MoltenEdgeSwordItem> MOLTEN_EDGE = ITEM.register( "molten_edge", () ->
// DISABLED:             new MoltenEdgeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (moltenedge_damage_modifier),
// DISABLED:                                         moltenedge_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<LivyatanSwordItem> LIVYATAN = ITEM.register( "livyatan", () ->
// DISABLED:             new LivyatanSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (livyatan_damage_modifier),
// DISABLED:                                         livyatan_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<IcewhisperSwordItem> ICEWHISPER = ITEM.register( "icewhisper", () ->
// DISABLED:             new IcewhisperSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (icewhisper_damage_modifier),
// DISABLED:                                         icewhisper_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));
// DISABLED:     public static final RegistrySupplier<ArcanethystSwordItem> ARCANETHYST = ITEM.register( "arcanethyst", () ->
// DISABLED:             new ArcanethystSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (arcanethyst_damage_modifier),
// DISABLED:                                         arcanethyst_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<ThunderbrandSwordItem> THUNDERBRAND = ITEM.register( "thunderbrand", () ->
// DISABLED:             new ThunderbrandSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (thunderbrand_damage_modifier),
// DISABLED:                                         thunderbrand_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     /*
// DISABLED:     public static final RegistrySupplier<RendSwordItem> THE_DISPATCHER = ITEM.register( "the_dispatcher", () ->
// DISABLED:             new RendSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (thedispatcher_damage_modifier),
// DISABLED:                                         thedispatcher_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:      */

// DISABLED:     public static final RegistrySupplier<StormSwordItem> MJOLNIR = ITEM.register( "mjolnir", () ->
// DISABLED:             new StormSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (mjolnir_damage_modifier),
// DISABLED:                                         mjolnir_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<LichbladeSwordItem> SLUMBERING_LICHBLADE = ITEM.register( "slumbering_lichblade", () ->
// DISABLED:             new LichbladeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (lichblade_damage_modifier),
// DISABLED:                                         lichblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<LichbladeSwordItem> WAKING_LICHBLADE = ITEM.register( "waking_lichblade", () ->
// DISABLED:             new LichbladeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (lichblade_damage_modifier),
// DISABLED:                                         lichblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<LichbladeSwordItem> AWAKENED_LICHBLADE = ITEM.register( "awakened_lichblade", () ->
// DISABLED:             new LichbladeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (lichblade_damage_modifier),
// DISABLED:                                         lichblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<ShadowstingSwordItem> SHADOWSTING = ITEM.register( "shadowsting", () ->
// DISABLED:             new ShadowstingSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (shadowsting_damage_modifier),
// DISABLED:                                         shadowsting_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<DormantRelicSwordItem> DORMANT_RELIC = ITEM.register( "dormant_relic", () ->
// DISABLED:             new DormantRelicSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (sunfire_damage_modifier),
// DISABLED:                                         sunfire_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<RighteousRelicSwordItem> RIGHTEOUS_RELIC = ITEM.register( "righteous_relic", () ->
// DISABLED:             new RighteousRelicSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (sunfire_damage_modifier),
// DISABLED:                                         sunfire_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<TaintedRelicSwordItem> TAINTED_RELIC = ITEM.register( "tainted_relic", () ->
// DISABLED:             new TaintedRelicSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (harbinger_damage_modifier),
// DISABLED:                                         harbinger_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<SunfireSwordItem> SUNFIRE = ITEM.register( "sunfire", () ->
// DISABLED:             new SunfireSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (sunfire_damage_modifier),
// DISABLED:                                         sunfire_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<HarbingerSwordItem> HARBINGER = ITEM.register( "harbinger", () ->
// DISABLED:             new HarbingerSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (harbinger_damage_modifier),
// DISABLED:                                         harbinger_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<WhisperwindSwordItem> WHISPERWIND = ITEM.register( "whisperwind", () ->
// DISABLED:             new WhisperwindSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (whisperwind_damage_modifier),
// DISABLED:                                         whisperwind_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED: /*
// DISABLED:     public static final RegistrySupplier<TaintedRelicSwordItem> STORMSCALE = ITEM.register( "stormscale", () ->
// DISABLED:             new TaintedRelicSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (harbinger_damage_modifier),
// DISABLED:                                         harbinger_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED: */

// DISABLED:     public static final RegistrySupplier<EmberlashSwordItem> EMBERLASH = ITEM.register( "emberlash", () ->
// DISABLED:             new EmberlashSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (emberlash_damage_modifier),
// DISABLED:                                         emberlash_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<WaxweaverSwordItem> WAXWEAVER = ITEM.register( "waxweaver", () ->
// DISABLED:             new WaxweaverSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (waxweaver_damage_modifier),
// DISABLED:                                         waxweaver_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<HiveheartSwordItem> HIVEHEART = ITEM.register( "hiveheart", () ->
// DISABLED:             new HiveheartSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (hiveheart_damage_modifier),
// DISABLED:                                         hiveheart_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<StarsEdgeSwordItem> STARS_EDGE = ITEM.register( "stars_edge", () ->
// DISABLED:             new StarsEdgeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (starsedge_damage_modifier),
// DISABLED:                                         starsedge_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<WickpiercerSwordItem> WICKPIERCER = ITEM.register( "wickpiercer", () ->
// DISABLED:             new WickpiercerSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (wickpiercer_damage_modifier),
// DISABLED:                                         wickpiercer_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<TempestSwordItem> TEMPEST = ITEM.register( "tempest", () ->
// DISABLED:             new TempestSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (tempest_damage_modifier),
// DISABLED:                                         tempest_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<FlamewindSwordItem> FLAMEWIND = ITEM.register( "flamewind", () ->
// DISABLED:             new FlamewindSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (flamewind_damage_modifier),
// DISABLED:                                         flamewind_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<RibboncleaverSwordItem> RIBBONCLEAVER = ITEM.register( "ribboncleaver", () ->
// DISABLED:             new RibboncleaverSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (ribboncleaver_damage_modifier),
// DISABLED:                                         ribboncleaver_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<DormantRelicSwordItem> DECAYING_RELIC = ITEM.register( "decaying_relic", () ->
// DISABLED:             new DormantRelicSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (magiscythe_damage_modifier),
// DISABLED:                                         magiscythe_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<MagiscytheSwordItem> MAGISCYTHE = ITEM.register( "magiscythe", () ->
// DISABLED:             new MagiscytheSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (magiscythe_damage_modifier),
// DISABLED:                                         magiscythe_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<EnigmaSwordItem> ENIGMA = ITEM.register( "enigma", () ->
// DISABLED:             new EnigmaSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (enigma_damage_modifier),
// DISABLED:                                         enigma_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<MagispearSwordItem> MAGISPEAR = ITEM.register( "magispear", () ->
// DISABLED:             new MagispearSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (magispear_damage_modifier),
// DISABLED:                                         magispear_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<MagibladeSwordItem> MAGIBLADE = ITEM.register( "magiblade", () ->
// DISABLED:             new MagibladeSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (magiblade_damage_modifier),
// DISABLED:                                         magiblade_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

// DISABLED:     public static final RegistrySupplier<CaelestisSwordItem> CAELESTIS = ITEM.register( "caelestis", () ->
// DISABLED:             new CaelestisSwordItem(ModToolMaterial.UNIQUE,
// DISABLED:                     (int) (caelestis_damage_modifier),
// DISABLED:                                         caelestis_attackspeed,
// DISABLED:                     new Item.Settings().arch$tab(SimpleSwordAvaritia.SIMPLE_SWORD_AVARITIA).rarity(Rarity.EPIC).fireproof()));

    // Placeholder items to prevent Simply Swords mixin crashes
    // Simply Swords LivingEntityMixin expects these items to exist
    public static final RegistrySupplier<Item> VOIDCLOAK = ITEM.register("voidcloak", () ->
            new Item(new Item.Settings()));
    public static final RegistrySupplier<Item> BATTLESTANDARD = ITEM.register("battlestandard", () ->
            new Item(new Item.Settings()));


}
