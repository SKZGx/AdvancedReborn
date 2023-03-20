package ml.pkom.advancedreborn.blocks;

import ml.pkom.mcpitanlibarch.api.event.block.TileCreateEvent;
import ml.pkom.advancedreborn.tile.TeleporterTile;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class Teleporter extends AdvancedMachineBlock {


    public Teleporter(Block.Settings settings) {
        super(settings);
    }

    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }

    // 1.17.1へのポート用
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return createBlockEntity(new TileCreateEvent(pos, state));
    }

    public BlockEntity createBlockEntity(BlockView world) {
        return createBlockEntity(new TileCreateEvent(world));
    }

    public BlockEntity createBlockEntity(TileCreateEvent event) {
        return new TeleporterTile(event);
    }

}
