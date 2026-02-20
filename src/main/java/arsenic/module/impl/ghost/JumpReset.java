import com.mojang.logging.LogUtils;
import net.minecraft.network.protocol.game.ClientboundPlayerPositionPacket;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.common.util.BooleanProperty;

public class JumpReset {
    // existing fields
    private BooleanProperty fakeCheck;
    private boolean allowNext;

    // updated logic in packet listener
    if (allowNext && fakeCheck) {
        shouldJump = true;
    } else {
        shouldJump = false;
    }
}