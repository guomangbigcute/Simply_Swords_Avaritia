package net.mayaguomang.simpleswordavaritia.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.compat.avaritia.AvaritiaCompatMaterial;
import net.mayaguomang.simpleswordavaritia.config.Config;
import net.mayaguomang.simpleswordavaritia.config.ConfigDefaultValues;
import net.mayaguomang.simpleswordavaritia.item.SimpleSwordAvaritiaSwordItem;
import net.mayaguomang.simpleswordavaritia.item.custom.avaritia.InfinityWeaponItem;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;

public class AvaritiaCompat {

    // Infinity Series - Base 15 weapons
    static float infinity_longsword_damageModifier = Config.getFloat("infinity_longsword_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_longsword_damageModifier);
    static float infinity_longsword_attackSpeed = Config.getFloat("infinity_longsword_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_longsword_attackSpeed);

    static float infinity_twinblade_damageModifier = Config.getFloat("infinity_twinblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_twinblade_damageModifier);
    static float infinity_twinblade_attackSpeed = Config.getFloat("infinity_twinblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_twinblade_attackSpeed);

    static float infinity_rapier_damageModifier = Config.getFloat("infinity_rapier_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_rapier_damageModifier);
    static float infinity_rapier_attackSpeed = Config.getFloat("infinity_rapier_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_rapier_attackSpeed);

    static float infinity_katana_damageModifier = Config.getFloat("infinity_katana_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_katana_damageModifier);
    static float infinity_katana_attackSpeed = Config.getFloat("infinity_katana_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_katana_attackSpeed);

    static float infinity_sai_damageModifier = Config.getFloat("infinity_sai_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_sai_damageModifier);
    static float infinity_sai_attackSpeed = Config.getFloat("infinity_sai_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_sai_attackSpeed);

    static float infinity_spear_damageModifier = Config.getFloat("infinity_spear_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_spear_damageModifier);
    static float infinity_spear_attackSpeed = Config.getFloat("infinity_spear_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_spear_attackSpeed);

    static float infinity_glaive_damageModifier = Config.getFloat("infinity_glaive_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_glaive_damageModifier);
    static float infinity_glaive_attackSpeed = Config.getFloat("infinity_glaive_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_glaive_attackSpeed);

    static float infinity_warglaive_damageModifier = Config.getFloat("infinity_warglaive_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_warglaive_damageModifier);
    static float infinity_warglaive_attackSpeed = Config.getFloat("infinity_warglaive_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_warglaive_attackSpeed);

    static float infinity_cutlass_damageModifier = Config.getFloat("infinity_cutlass_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_cutlass_damageModifier);
    static float infinity_cutlass_attackSpeed = Config.getFloat("infinity_cutlass_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_cutlass_attackSpeed);

    static float infinity_claymore_damageModifier = Config.getFloat("infinity_claymore_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_claymore_damageModifier);
    static float infinity_claymore_attackSpeed = Config.getFloat("infinity_claymore_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_claymore_attackSpeed);

    static float infinity_greathammer_damageModifier = Config.getFloat("infinity_greathammer_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_greathammer_damageModifier);
    static float infinity_greathammer_attackSpeed = Config.getFloat("infinity_greathammer_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_greathammer_attackSpeed);

    static float infinity_greataxe_damageModifier = Config.getFloat("infinity_greataxe_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_greataxe_damageModifier);
    static float infinity_greataxe_attackSpeed = Config.getFloat("infinity_greataxe_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_greataxe_attackSpeed);

    static float infinity_chakram_damageModifier = Config.getFloat("infinity_chakram_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_chakram_damageModifier);
    static float infinity_chakram_attackSpeed = Config.getFloat("infinity_chakram_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_chakram_attackSpeed);

    static float infinity_scythe_damageModifier = Config.getFloat("infinity_scythe_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_scythe_damageModifier);
    static float infinity_scythe_attackSpeed = Config.getFloat("infinity_scythe_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_scythe_attackSpeed);

    static float infinity_halberd_damageModifier = Config.getFloat("infinity_halberd_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_halberd_damageModifier);
    static float infinity_halberd_attackSpeed = Config.getFloat("infinity_halberd_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_halberd_attackSpeed);

    public static final DeferredRegister<Item> ITEM = ItemsRegistry.ITEM;

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_LONGSWORD = ITEM.register("infinity_longsword", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_longsword_damageModifier),
                    infinity_longsword_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_TWINBLADE = ITEM.register("infinity_twinblade", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_twinblade_damageModifier),
                    infinity_twinblade_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_RAPIER = ITEM.register("infinity_rapier", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_rapier_damageModifier),
                    infinity_rapier_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_KATANA = ITEM.register("infinity_katana", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_katana_damageModifier),
                    infinity_katana_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_SAI = ITEM.register("infinity_sai", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_sai_damageModifier),
                    infinity_sai_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_SPEAR = ITEM.register("infinity_spear", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_spear_damageModifier),
                    infinity_spear_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_GLAIVE = ITEM.register("infinity_glaive", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_glaive_damageModifier),
                    infinity_glaive_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_WARGLAIVE = ITEM.register("infinity_warglaive", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_warglaive_damageModifier),
                    infinity_warglaive_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_CUTLASS = ITEM.register("infinity_cutlass", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_cutlass_damageModifier),
                    infinity_cutlass_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_CLAYMORE = ITEM.register("infinity_claymore", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_claymore_damageModifier),
                    infinity_claymore_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_GREATHAMMER = ITEM.register("infinity_greathammer", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_greathammer_damageModifier),
                    infinity_greathammer_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<InfinityWeaponItem> INFINITY_GREATAXE = ITEM.register("infinity_greataxe", () ->
            new InfinityWeaponItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_greataxe_damageModifier),
                    infinity_greataxe_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_CHAKRAM = ITEM.register("infinity_chakram", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_chakram_damageModifier),
                    infinity_chakram_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_SCYTHE = ITEM.register("infinity_scythe", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_scythe_damageModifier),
                    infinity_scythe_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_HALBERD = ITEM.register("infinity_halberd", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_halberd_damageModifier),
                    infinity_halberd_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static void registerModItems() {
        SimpleSwordAvaritia.LOGGER.info("Registering Avaritia compat Items for " + SimpleSwordAvaritia.MOD_ID);
    }

}
