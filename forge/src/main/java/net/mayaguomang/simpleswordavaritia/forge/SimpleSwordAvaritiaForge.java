package net.mayaguomang.simpleswordavaritia.forge;

import dev.architectury.platform.forge.EventBuses;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.config.ConfigWrapper;

@Mod(SimpleSwordAvaritia.MOD_ID)
public class SimpleSwordAvaritiaForge {
    public SimpleSwordAvaritiaForge() {
        // Submit our event bus to let architectury register our content on the right time -
        EventBuses.registerModEventBus(SimpleSwordAvaritia.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        SimpleSwordAvaritia.init();

        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () -> {
            return new ConfigScreenHandler.ConfigScreenFactory((minecraft, screen) -> {
                return AutoConfig.getConfigScreen(ConfigWrapper.class, screen).get();
            });
        });

    }
}
