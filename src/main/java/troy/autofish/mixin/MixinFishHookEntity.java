package troy.autofish.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import troy.autofish.FabricModAutofish;
import com.mojang.logging.LogUtils; 
import org.slf4j.Logger; 

@Mixin(FishingBobberEntity.class)
public abstract class MixinFishHookEntity {

    @Shadow public abstract PlayerEntity getPlayerOwner(); 
    @Shadow private int hookCountdown; 
    private static final Logger LOGGER = LogUtils.getLogger();

    @Inject(method = "tick", at = @At("TAIL"))
    private void onTick(CallbackInfo ci) {

        if (this.hookCountdown > 0) {
            LOGGER.info("AutoFish Debug] hookCountdown: " + this.hookCountdown);
            FabricModAutofish.getInstance().tickFishingLogic(this.getPlayerOwner(), this.hookCountdown);
        }
    }
}
