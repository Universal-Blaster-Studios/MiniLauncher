/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.universalblaster.minilauncher.Configuration;

/**
 *
 * @author Luke
 */
public class MLCFGSpec {
    private final String packName, packAuthor, packVersion;

    public MLCFGSpec(String packName, String packAuthor, String packVersion) {
        this.packName = packName;
        this.packAuthor = packAuthor;
        this.packVersion = packVersion;
    }

    public String getPackAuthor() {
        return packAuthor;
    }

    public String getPackName() {
        return packName;
    }

    public String getPackVersion() {
        return packVersion;
    }

    @Override
    public String toString() {
        return "Name: " + getPackName() + "\nAuthor: " + getPackAuthor() + "\nVersion: " + getPackVersion();
    }
    
    
}
