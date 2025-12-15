package bluebird.acc.client.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {
    @Inject(
            method = "swingHand(Lnet/minecraft/util/Hand;Z)V",
            at = @At("HEAD")
    )
    private void onSwingHand(Hand hand, boolean fromServer, CallbackInfo ci) {
        if ((Object) this instanceof ClientPlayerEntity player) {
            player.resetLastAttackedTicks();
        }
    }
}
