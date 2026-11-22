package com.pepoyospawncontrol.mixin;

import net.mcreator.pepoyo.entity.YorupoasuraEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = YorupoasuraEntity.class, remap = false)
public abstract class YorupoasuraEntityMixin {
    @Inject(method = "init", at = @At("HEAD"), cancellable = true, remap = false)
    private static void pepoyoSpawnControl$disableRaidRegistration(CallbackInfo ci) {
        ci.cancel();
    }
}
