package io.github.darkkronicle.advancedchathud.util;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;

@Environment(EnvType.CLIENT)
public class ScissorUtil {

    private ScissorUtil() {
    }

    public static void applyScissorBox(DrawContext drawContext, int x, int y, int width, int height) {
        drawContext.enableScissor(x, y, width, height);
    }

    public static void applyScissor(DrawContext drawContext, int x1, int y1, int x2, int y2) {
        drawContext.enableScissor(x1, y1, x2 - x1, y2 - y1);
    }

    public static void resetScissor(DrawContext drawContext) {
        drawContext.disableScissor();
    }
}
