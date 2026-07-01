package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class SnaplookMod {

    public static boolean init() {
        // Встроенный модуль Snaplook отключён
        return false;
    }

    public static native boolean nativeInit();
    public static native void nativeSetSnaplookEnabled(boolean enabled);
    public static native boolean nativeIsSnaplookEnabled();
}
