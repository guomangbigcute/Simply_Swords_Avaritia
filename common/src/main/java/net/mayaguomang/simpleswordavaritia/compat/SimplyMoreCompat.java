package net.mayaguomang.simpleswordavaritia.compat;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.Item;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.compat.avaritia.AvaritiaCompatMaterial;
import net.mayaguomang.simpleswordavaritia.config.Config;
import net.mayaguomang.simpleswordavaritia.config.ConfigDefaultValues;
import net.mayaguomang.simpleswordavaritia.item.SimpleSwordAvaritiaSwordItem;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;

public class SimplyMoreCompat {

    // Simply More Additional Weapons (Infinity Series)
    static float infinity_greatkatana_damageModifier = Config.getFloat("infinity_greatkatana_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_greatkatana_damageModifier);
    static float infinity_greatkatana_attackSpeed = Config.getFloat("infinity_greatkatana_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_greatkatana_attackSpeed);

    static float infinity_lance_damageModifier = Config.getFloat("infinity_lance_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_lance_damageModifier);
    static float infinity_lance_attackSpeed = Config.getFloat("infinity_lance_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_lance_attackSpeed);

    static float infinity_grandsword_damageModifier = Config.getFloat("infinity_grandsword_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_grandsword_damageModifier);
    static float infinity_grandsword_attackSpeed = Config.getFloat("infinity_grandsword_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_grandsword_attackSpeed);

    static float infinity_backhandblade_damageModifier = Config.getFloat("infinity_backhandblade_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_backhandblade_damageModifier);
    static float infinity_backhandblade_attackSpeed = Config.getFloat("infinity_backhandblade_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_backhandblade_attackSpeed);

    static float infinity_khopesh_damageModifier = Config.getFloat("infinity_khopesh_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_khopesh_damageModifier);
    static float infinity_khopesh_attackSpeed = Config.getFloat("infinity_khopesh_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_khopesh_attackSpeed);

    static float infinity_dagger_damageModifier = Config.getFloat("infinity_dagger_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_dagger_damageModifier);
    static float infinity_dagger_attackSpeed = Config.getFloat("infinity_dagger_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_dagger_attackSpeed);

    static float infinity_pernach_damageModifier = Config.getFloat("infinity_pernach_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_pernach_damageModifier);
    static float infinity_pernach_attackSpeed = Config.getFloat("infinity_pernach_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_pernach_attackSpeed);

    static float infinity_greatspear_damageModifier = Config.getFloat("infinity_greatspear_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_greatspear_damageModifier);
    static float infinity_greatspear_attackSpeed = Config.getFloat("infinity_greatspear_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_greatspear_attackSpeed);

    static float infinity_quarterstaff_damageModifier = Config.getFloat("infinity_quarterstaff_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_quarterstaff_damageModifier);
    static float infinity_quarterstaff_attackSpeed = Config.getFloat("infinity_quarterstaff_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_quarterstaff_attackSpeed);

    static float infinity_deerhorns_damageModifier = Config.getFloat("infinity_deerhorns_damageModifier", "WeaponAttributes", ConfigDefaultValues.infinity_deerhorns_damageModifier);
    static float infinity_deerhorns_attackSpeed = Config.getFloat("infinity_deerhorns_attackSpeed", "WeaponAttributes", ConfigDefaultValues.infinity_deerhorns_attackSpeed);

    public static final DeferredRegister<Item> ITEM = ItemsRegistry.ITEM;

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_GREATKATANA = ITEM.register("avaritia_compat/infinity_greatkatana", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_greatkatana_damageModifier),
                    infinity_greatkatana_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_LANCE = ITEM.register("avaritia_compat/infinity_lance", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_lance_damageModifier),
                    infinity_lance_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_GRANDSWORD = ITEM.register("avaritia_compat/infinity_grandsword", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_grandsword_damageModifier),
                    infinity_grandsword_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_BACKHANDBLADE = ITEM.register("avaritia_compat/infinity_backhandblade", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_backhandblade_damageModifier),
                    infinity_backhandblade_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_KHOPESH = ITEM.register("avaritia_compat/infinity_khopesh", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_khopesh_damageModifier),
                    infinity_khopesh_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_DAGGER = ITEM.register("avaritia_compat/infinity_dagger", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_dagger_damageModifier),
                    infinity_dagger_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_PERNACH = ITEM.register("avaritia_compat/infinity_pernach", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_pernach_damageModifier),
                    infinity_pernach_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_GREATSPEAR = ITEM.register("avaritia_compat/infinity_greatspear", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_greatspear_damageModifier),
                    infinity_greatspear_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_QUARTERSTAFF = ITEM.register("avaritia_compat/infinity_quarterstaff", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_quarterstaff_damageModifier),
                    infinity_quarterstaff_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static final RegistrySupplier<SimpleSwordAvaritiaSwordItem> INFINITY_DEERHORNS = ITEM.register("avaritia_compat/infinity_deerhorns", () ->
            new SimpleSwordAvaritiaSwordItem(AvaritiaCompatMaterial.INFINITY,
                    (int) (infinity_deerhorns_damageModifier),
                    infinity_deerhorns_attackSpeed,
                    "avaritia:infinity_ingot"));

    public static void registerModItems() {
        SimpleSwordAvaritia.LOGGER.info("Registering Simply More compat Items for " + SimpleSwordAvaritia.MOD_ID);
    }

}
