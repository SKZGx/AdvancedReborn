package ml.pkom.advancedreborn;

import ml.pkom.advancedreborn.tile.CardboardBoxTile;
import ml.pkom.advancedreborn.tile.RenamingMachineTile;
import ml.pkom.mcpitanlibarch.api.network.ServerNetworking;
import ml.pkom.mcpitanlibarch.api.util.math.PosUtil;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;

public class Network {
    public static void init() {
        ServerNetworking.registerReceiver(Defines.CARDBOARD_BOX_CLOSE_PACKET_ID, (server, player, buf) -> {
            NbtCompound data = buf.readNbt();
            server.execute(() -> {
                if (data == null) return;
                if (!data.contains("x")) return;
                if (!data.contains("y")) return;
                if (!data.contains("z")) return;
                if (!data.contains("note")) return;
                BlockEntity blockEntity = player.world.getBlockEntity(PosUtil.flooredBlockPos(data.getDouble("x"), data.getDouble("y"), data.getDouble("z")));
                if (!(blockEntity instanceof CardboardBoxTile)) return;
                CardboardBoxTile tile = (CardboardBoxTile) blockEntity;
                tile.setNote(data.getString("note"));
            });
        });
        ServerNetworking.registerReceiver(Defines.RENAMING_PACKET_ID, (server, player, buf) -> {
            NbtCompound data = buf.readNbt();
            server.execute(() -> {
                if (data == null) return;
                if (!data.contains("x")) return;
                if (!data.contains("y")) return;
                if (!data.contains("z")) return;
                if (!data.contains("name")) return;
                BlockEntity blockEntity = player.world.getBlockEntity(PosUtil.flooredBlockPos(data.getDouble("x"), data.getDouble("y"), data.getDouble("z")));
                if (!(blockEntity instanceof RenamingMachineTile)) return;
                RenamingMachineTile tile = (RenamingMachineTile) blockEntity;
                tile.setName(data.getString("name"));
            });
        });
    }
}
