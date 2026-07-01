package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class FpsMod {

    public static boolean init() {
        // Встроенный модуль FPS отключён
        return false;
    }

    // Нативные методы оставляем, но они не будут вызываться
    public static native boolean nativeInit();
    public static native int nativeGetFps();
    public static native boolean nativeIsInitialized();
}
