package arsenic.module.impl.ghost;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Clicker {
    // Existing fields and methods...

    public void eventRunTickListener(PlayerEntity player) {
        // New block breaking detection logic
        if (isBreakingBlock(player)) {
            return; // Skip clicking if breaking a block
        }

        // Existing click logic goes here...
    }

    private boolean isBreakingBlock(PlayerEntity player) {
        // Check player's current action and return true if breaking a block
        return player.getHeldItemMainhand().getItem().isBlock();
    }

    // Existing methods continue...
}