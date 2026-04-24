package net.mayaguomang.simpleswordavaritia.client.renderer;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import net.mayaguomang.simpleswordavaritia.SimpleSwordAvaritia;
import net.mayaguomang.simpleswordavaritia.client.renderer.model.BattleStandardModel;
import net.mayaguomang.simpleswordavaritia.entity.BattleStandardEntity;

@Environment(value= EnvType.CLIENT)
public class BattleStandardRenderer extends MobEntityRenderer<BattleStandardEntity, BattleStandardModel> {


     private static final Identifier TEXTURE = new Identifier("simple_sword_avaritia","textures/entity/battlestandard/battlestandard_texture.png");

     public BattleStandardRenderer(EntityRendererFactory.Context context) {
         super(context, new BattleStandardModel(context.getPart(SimpleSwordAvaritia.Client.BATTLESTANDARD_MODEL)), 0.1f);
     }

    @Override
    public Identifier getTexture(BattleStandardEntity entity) {
        return TEXTURE;
    }
}
