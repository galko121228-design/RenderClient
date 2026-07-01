package org.levimc.launcher.core.mods.inbuilt.nativemod;

public class InbuiltModsNative {
    private static boolean libraryLoaded = false;

    public static synchronized boolean loadLibrary() {
        // Библиотека inbuiltmods отключена, всегда возвращаем true
        libraryLoaded = true;
        return true;
    }

    public static boolean isLoaded() {
        return libraryLoaded;
    }
}
