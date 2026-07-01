package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class ZoomMod {

    public static boolean init() {
        // Встроенный модуль Zoom отключён
        return false;
    }

    // Заглушки для методов, которые вызываются из оверлея
    public static void nativeSetZoomLevel(float level) {
        // ничего не делаем
    }

    public static void nativeOnKeyDown() {
        // ничего не делаем
    }

    public static void nativeOnKeyUp() {
        // ничего не делаем
    }

    public static void nativeOnScroll(float delta) {
        // ничего не делаем
    }

    // Оригинальные нативные методы (можно оставить, но они не будут использоваться)
    public static native boolean nativeInit();
    public static native void nativeSetZoomEnabled(boolean enabled);
    public static native boolean nativeIsZoomEnabled();
}
