package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class ZoomMod {

    public static boolean init() {
        // Встроенный модуль Zoom отключён
        return false;
    }

    public static native boolean nativeInit();
    public static native void nativeSetZoomEnabled(boolean enabled);
    public static native boolean nativeIsZoomEnabled();
}
