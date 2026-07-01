package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class SnaplookMod {

    public static boolean init() {
        // Встроенный модуль Snaplook отключён
        return false;
    }

    // Заглушки для методов, вызываемых из оверлея
    public static void nativeOnKeyDown() {
        // ничего не делаем
    }

    public static void nativeOnKeyUp() {
        // ничего не делаем
    }

    // Оригинальные нативные методы
    public static native boolean nativeInit();
    public static native void nativeSetSnaplookEnabled(boolean enabled);
    public static native boolean nativeIsSnaplookEnabled();
}
