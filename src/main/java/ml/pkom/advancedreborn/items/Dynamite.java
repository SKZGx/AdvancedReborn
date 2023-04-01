package ml.pkom.advancedreborn.items;

import ml.pkom.advancedreborn.entities.DynamiteEntity;
import ml.pkom.mcpitanlibarch.api.event.item.ItemUseEvent;
import ml.pkom.mcpitanlibarch.api.item.CompatibleItemSettings;
import ml.pkom.mcpitanlibarch.api.item.ExtendItem;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class Dynamite extends ExtendItem {

    public boolean isSticky = false;
    public boolean isIndustrial = false;

    public Dynamite(CompatibleItemSettings settings) {
        super(settings);
        DispenserBlock.registerBehavior(this, new ProjectileDispenserBehavior() {
            public ProjectileEntity createProjectile(World world, Position pos, ItemStack stack) {
                DynamiteEntity dynamiteEntity = new DynamiteEntity(world, pos.getX(), pos.getY(), pos.getZ());
                dynamiteEntity.setItem(stack);
                dynamiteEntity.setSticky(isSticky);
                dynamiteEntity.setIndustrial(isIndustrial);
                return dynamiteEntity;
            }
        });
    }

    public Dynamite(CompatibleItemSettings settings, boolean isSticky) {
        this(settings);
        this.isSticky = isSticky;
    }

    public Dynamite(CompatibleItemSettings settings, boolean isSticky, boolean isIndustrial) {
        this(settings);
        this.isSticky = isSticky;
        this.isIndustrial = isIndustrial;
    }

    public TypedActionResult<ItemStack> onRightClick(ItemUseEvent event) {
        ItemStack stack = event.user.getPlayerEntity().getStackInHand(event.hand);
        if (!event.user.getAbilities().creativeMode) stack.decrement(1);
        if (!event.world.isClient()) {
            DynamiteEntity dynamiteEntity = new DynamiteEntity(event.world, event.user.getEntity());
            dynamiteEntity.setProperties(event.user.getEntity(), event.user.getPitch(), event.user.getYaw(), 0.0F, 1.5F, 1.0F);
            dynamiteEntity.setItem(stack);
            dynamiteEntity.setSticky(isSticky);
            dynamiteEntity.setIndustrial(isIndustrial);
            event.world.spawnEntity(dynamiteEntity);
            event.world.playSound(null, dynamiteEntity.getX(), dynamiteEntity.getY(), dynamiteEntity.getZ(), SoundEvents.ENTITY_TNT_PRIMED, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        return TypedActionResult.success(stack);
    }
}
