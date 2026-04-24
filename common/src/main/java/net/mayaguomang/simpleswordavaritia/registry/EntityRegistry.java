package net.mayaguomang.simpleswordavaritia.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardDarkEntity;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardEntity;
import net.mayaguomang.simpleswordavaritia.entity.SimpleSwordAvaritiaBeeEntity;

public class EntityRegistry {

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(SimpleSwordAvaritia.MOD_ID, RegistryKeys.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<BattleStandardEntity>> BATTLESTANDARD = ENTITIES.register("battlestandard", BattleStandardEntity.TYPE);
    public static final RegistrySupplier<EntityType<BattleStandardDarkEntity>> BATTLESTANDARDDARK = ENTITIES.register("battlestandarddark", BattleStandardDarkEntity.TYPE);
    public static final RegistrySupplier<EntityType<SimpleSwordAvaritiaBeeEntity>> SIMPLYBEEENTITY = ENTITIES.register(
            "simplybeeentity",
            () -> EntityType.Builder.create(SimpleSwordAvaritiaBeeEntity::new, SpawnGroup.CREATURE)
                    .build(new Identifier(SimpleSwordAvaritia.MOD_ID, "simplybeeentity").toString())
    );


}
