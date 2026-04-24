package net.mayaguomang.simpleswordavaritia.util;

import dev.architectury.platform.Platform;
import net.minecraft.resource.ResourceType;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

@SuppressWarnings({"resource", "ConstantConditions", "ResultOfMethodCallIgnored"})
public class FileCopier {
    private static final String DATA_PREFIX = ResourceType.SERVER_DATA.getDirectory() + '/';

    public static void copyFileToConfigDirectory() throws IOException {
        if (!Platform.isModLoaded(SimpleSwordAvaritia.MOD_ID)
                || !SimpleSwordAvaritia.passVersionCheck("eldritch_end", SimpleSwordAvaritia.minimumEldritchEndVersion)
                || Platform.isForge())
            return;

        Optional<Path> simplySwords$safeRecipePath = Platform.getMod(SimpleSwordAvaritia.MOD_ID).findResource(
                DATA_PREFIX + SimpleSwordAvaritia.MOD_ID + "/safeload_recipes/eldritch_end/dreadtide.json"
        );
        Optional<Path> simplySwords$recipePath = Platform.getMod(SimpleSwordAvaritia.MOD_ID).findResource(
                DATA_PREFIX + SimpleSwordAvaritia.MOD_ID + "/recipes/eldritch_end/dreadtide.json"
        );

        if (simplySwords$safeRecipePath.isEmpty())
            return;

        Path sourcePath = simplySwords$safeRecipePath.get();
        Path targetPath = simplySwords$recipePath.get();

        // Ensure the directories exist
        Files.createDirectories(targetPath.getParent());

        // Copy the file, replacing existing file at the destination if it exists
        Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied from " + sourcePath + " to " + targetPath);
    }
}