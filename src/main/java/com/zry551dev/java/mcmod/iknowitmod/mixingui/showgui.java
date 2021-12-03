package com.zry551dev.java.mcmod.iknowitmod.mixingui;

import net.minecraft.client.GameConfiguration;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;


@Mixin(Minecraft.class)
public class showgui<WorldSelectionType>  {



    /**
     * @author
     */
    @Overwrite
    private void displayExperimentalConfirmationDialog(WorldSelectionType p_241559_1_, String p_241559_2_, boolean p_241559_3_, Runnable p_241559_4_) {
        p_241559_4_.run();

    }
}
