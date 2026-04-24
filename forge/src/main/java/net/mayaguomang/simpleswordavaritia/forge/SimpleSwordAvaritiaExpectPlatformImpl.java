package net.mayaguomang.simpleswordavaritia.forge;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLPaths;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritiaExpectPlatform;

import java.nio.file.Path;

import static net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia.MOD_ID;

public class SimpleSwordAvaritiaExpectPlatformImpl {
    /**
     * This is our actual method to {@link SimpleSwordAvaritiaExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FMLPaths.CONFIGDIR.get();
    }

    public static String getVersion() {return ModList.get().getModContainerById(MOD_ID).map(it -> it.getModInfo().getVersion().toString()).orElseThrow();}

}