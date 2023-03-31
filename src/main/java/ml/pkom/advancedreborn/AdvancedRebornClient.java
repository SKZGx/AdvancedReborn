package ml.pkom.advancedreborn;

import ml.pkom.advancedreborn.packet.EntitySpawnPacket;
import ml.pkom.advancedreborn.renderer.IndustrialTNTEntityRenderer;
import ml.pkom.advancedreborn.screen.CardboardBoxScreen;
import ml.pkom.mcpitanlibarch.api.client.registry.ArchRegistryClient;
import ml.pkom.mcpitanlibarch.api.network.ClientNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.particle.EmotionParticle;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;

import java.util.UUID;

public class AdvancedRebornClient implements ClientModInitializer {

    public static MinecraftClient client = MinecraftClient.getInstance();

    public void onInitializeClient() {
        //ClientGuiTypes.init(); → TechRebornClientMixin
        //ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
        //    registry.register(AdvancedReborn.id("particle/energy"));
        //}));
        ArchRegistryClient.registryClientSpriteAtlasTexture(AdvancedReborn.id("particle/energy"));

        ArchRegistryClient.registerParticle(Particles.ENERGY, EmotionParticle.HeartFactory::new);

        ArchRegistryClient.registerEntityRenderer(() -> Entities.DYNAMITE, FlyingItemEntityRenderer::new);
        ArchRegistryClient.registerEntityRenderer(() -> Entities.I_TNT, IndustrialTNTEntityRenderer::new);

        ArchRegistryClient.registerScreen(ScreenHandlers.CARDBOARD_BOX_SCREEN_HANDLER, CardboardBoxScreen::new);

        ClientNetworking.registerReceiver(Defines.SPAWN_PACKET_ID, (client, player, byteBuf) -> {
            EntityType<?> et = Registry.ENTITY_TYPE.get(byteBuf.readVarInt());
            UUID uuid = byteBuf.readUuid();
            int entityId = byteBuf.readVarInt();
            Vec3d pos = EntitySpawnPacket.PacketBufUtil.readVec3d(byteBuf);
            float pitch = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            float yaw = EntitySpawnPacket.PacketBufUtil.readAngle(byteBuf);
            if (client.world == null) return;
            Entity entity = et.create(client.world);
            if (entity == null) return;
            entity.updateTrackedPosition(pos.x, pos.y, pos.z);
            entity.setPos(pos.x, pos.y, pos.z);
            entity.setYaw(pitch);
            entity.setYaw(yaw);
            entity.setId(entityId);
            entity.setUuid(uuid);
            client.world.addEntity(entityId, entity);
        });
    }
}