package com.dev.hoiscripthelper;

import java.awt.*;
import java.io.File;

public class FileOpener {
    public static void openFileInDefaultEditor(File file) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.edit(file);
            } catch (Exception e) {
                try {
                    Runtime.getRuntime().exec(new String[]{"xed", file.getAbsolutePath()});
                } catch (Exception ex) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Desktop is not supported");
        }
    }
}
