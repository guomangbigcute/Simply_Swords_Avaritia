package net.mayaguomang.simpleswordavaritia;

import com.google.gson.JsonObject;
import dev.architectury.platform.Platform;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.client.level.entity.EntityModelLayerRegistry;
import dev.architectury.registry.client.level.entity.EntityRendererRegistry;
import dev.architectury.registry.level.entity.EntityAttributeRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.BeeEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.mayaguomang.simpleswordavaritia.client.renderer.BattleStandardDarkRenderer;
import net.mayaguomang.simpleswordavaritia.client.renderer.BattleStandardRenderer;
import net.mayaguomang.simpleswordavaritia.client.renderer.model.BattleStandardDarkModel;
import net.mayaguomang.simpleswordavaritia.client.renderer.model.BattleStandardModel;
// DISABLED: import net.mayaguomang.simpleswordavaritia.compat.EldritchEndCompat; // Eldritch End compat disabled
// DISABLED: import net.mayaguomang.simpleswordavaritia.compat.eldritch_end.EldritchEndCompatRegistry; // Eldritch End compat disabled
import net.mayaguomang.simpleswordavaritia.compat.AvaritiaCompat;
import net.mayaguomang.simpleswordavaritia.compat.SimplyMoreCompat;
import net.mayaguomang.simpleswordavaritia.config.*;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardDarkEntity;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardEntity;
import net.mayaguomang.simpleswordavaritia.entity.SimpleSwordAvaritiaBeeEntity;
import net.mayaguomang.simpleswordavaritia.registry.EffectRegistry;
import net.mayaguomang.simpleswordavaritia.registry.EntityRegistry;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;
import net.mayaguomang.simpleswordavaritia.registry.ItemsRegistry;
// import net.mayaguomang.simpleswordavaritia.registry.MinimalItemsRegistry; // Deprecated - placeholder items moved to ItemsRegistry
import net.mayaguomang.simpleswordavaritia.registry.SoundRegistry;
import net.mayaguomang.simpleswordavaritia.util.FileCopier;
import net.mayaguomang.simpleswordavaritia.util.ModLootTableModifiers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class SimpleSwordAvaritia {
    public static final String MOD_ID = "simple_sword_avaritia";

    public static final DeferredRegister<ItemGroup> TABS =
            DeferredRegister.create(SimpleSwordAvaritia.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> SIMPLE_SWORD_AVARITIA = TABS.register(
            "simple_sword_avaritia", // Tab ID
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.simple_sword_avaritia.simple_sword_avaritia"), // Tab Name
                    () -> new ItemStack(AvaritiaCompat.INFINITY_GREATAXE.get()) // Icon - use Infinity Greataxe
            )
    );


    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public static boolean isConfigOutdated;
    public static GeneralConfig generalConfig;
    public static LootConfig lootConfig;
    public static GemEffectsConfig gemEffectsConfig;
    public static RunicEffectsConfig runicEffectsConfig;
    public static StatusEffectsConfig statusEffectsConfig;
    public static UniqueEffectsConfig uniqueEffectsConfig;
    public static WeaponAttributesConfig weaponAttributesConfig;

    public static String minimumEldritchEndVersion = "0.2.40";
    public static String minimumSpellPowerVersion = "0.10.0+1.20.1";
    public static String minimumAvaritiaVersion = "1.0";
    public static String minimumSimplyMoreVersion = "1.0";

    public static void init() {

        //CONFIG

        SimpleSwordAvaritiaConfig.init();

        AutoConfig.register(ConfigWrapper.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
        generalConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().general;
        lootConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().loot;
        gemEffectsConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().gem_effects;
        runicEffectsConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().runic_effects;
        statusEffectsConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().status_effects;
        uniqueEffectsConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().unique_effects;
        weaponAttributesConfig = AutoConfig.getConfigHolder(ConfigWrapper.class).getConfig().weapon_attributes;

        String version = SimpleSwordAvaritiaExpectPlatform.getVersion();
        String defaultConfig = String.format("""
                {
                  "regen_config_file": false,
                  "config_version": %s
                }""", version.substring(0, 4));

        File configFile = Config.createFile("config/simple_sword_avaritia/backupconfig.json", defaultConfig, false);
        JsonObject json = Config.getJsonObject(Config.readFile(configFile));
        if (json.has("config_version") && version.startsWith(json.get("config_version").getAsString())) {
            isConfigOutdated = false;
        } else {
            isConfigOutdated = true;
        }

        SimpleSwordAvaritiaConfig.generateConfigs(json == null || !json.has("regen_config_file") || json.get("regen_config_file").getAsBoolean());
        SimpleSwordAvaritiaConfig.loadConfig();


        SimpleSwordAvaritia.TABS.register();
        ItemsRegistry.ITEM.register();
        // MinimalItemsRegistry is deprecated - placeholder items moved to ItemsRegistry
        // SoundRegistry.SOUND.register();  // Disabled - not needed for Infinity series
        // EffectRegistry.EFFECT.register();  // Disabled - not needed for Infinity series
        // EntityRegistry.ENTITIES.register();  // Disabled - not needed for Infinity series
        // EntityAttributeRegistry.register(EntityRegistry.BATTLESTANDARD, BattleStandardEntity::createBattleStandardAttributes);  // Disabled
        // EntityAttributeRegistry.register(EntityRegistry.BATTLESTANDARDDARK, BattleStandardDarkEntity::createBattleStandardDarkAttributes);  // Disabled
        // EntityAttributeRegistry.register(EntityRegistry.SIMPLYBEEENTITY, SimpleSwordAvaritiaBeeEntity::createSimpleSwordAvaritiaBeeAttributes);  // Disabled
        // ModLootTableModifiers.init();  // Disabled - no loot drops for Infinity series
        if (passVersionCheck("eldritch_end", minimumEldritchEndVersion)) {
            // EldritchEndCompat.registerModItems();  // Disabled - not needed
            // EldritchEndCompatRegistry.EFFECT.register();  // Disabled
        }
        if (passVersionCheck("avaritia", minimumAvaritiaVersion)) {
            AvaritiaCompat.registerModItems();
        }
        if (passVersionCheck("simplymore", minimumSimplyMoreVersion)) {
            SimplyMoreCompat.registerModItems();
        }
        try {
            FileCopier.copyFileToConfigDirectory();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(SimpleSwordAvaritiaExpectPlatform.getConfigDirectory().toAbsolutePath().normalize().toString());
        EnvExecutor.runInEnv(Env.CLIENT, () -> SimpleSwordAvaritia.Client::initializeClient);

    }

    public static boolean passVersionCheck(String modId, String requiredVersion) {
        if (Platform.isModLoaded(modId)) {
            if (Platform.getMod(modId).getVersion().compareTo(requiredVersion) >= 0) {
                return true;
            }
        }
        return false;
    }

    @Environment(EnvType.CLIENT)
    public static class Client {
        public static final EntityModelLayer BATTLESTANDARD_MODEL = new EntityModelLayer(new Identifier("battlestandard", "cube"), "main");
        public static final EntityModelLayer BATTLESTANDARD_DARK_MODEL = new EntityModelLayer(new Identifier("battlestandarddark", "cube"), "main");

        @Environment(EnvType.CLIENT)
        public static void initializeClient() {
            // EntityRendererRegistry.register(EntityRegistry.BATTLESTANDARD, BattleStandardRenderer::new);  // Disabled
            // EntityModelLayerRegistry.register(BATTLESTANDARD_MODEL, BattleStandardModel::getTexturedModelData);  // Disabled
            // EntityRendererRegistry.register(EntityRegistry.BATTLESTANDARDDARK, BattleStandardDarkRenderer::new);  // Disabled
            // EntityModelLayerRegistry.register(BATTLESTANDARD_DARK_MODEL, BattleStandardDarkModel::getTexturedModelData);  // Disabled
            // EntityRendererRegistry.register(EntityRegistry.SIMPLYBEEENTITY, BeeEntityRenderer::new);  // Disabled
        }
    }

}
