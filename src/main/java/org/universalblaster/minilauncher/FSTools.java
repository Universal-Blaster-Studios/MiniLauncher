/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.universalblaster.minilauncher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.apache.commons.io.FilenameUtils;
import org.universalblaster.minilauncher.Configuration.MLCFGSpec;

/**
 *
 * @author Luke M <luke.m@universalblaster.org>
 */
public class FSTools {
    
    public static File[] searchPath(File path) {
        File curDir = path;
        File[] dircontents = curDir.listFiles();
        return dircontents;
    }
    
    public static class ConfigParser {
        public MLCFGSpec confFile(File confFile) {
            try {
                Scanner scln = new Scanner(confFile);
                while (scln.hasNextLine()) {
                    String packname = scln.nextLine().split(":=")[1];
                    System.out.println(packname);
                    String packauth = scln.nextLine().split(":=")[1];
                    System.out.println(packauth);
                    String packver = scln.nextLine().split(":=")[1];
                    System.out.println(packver);
                    return new MLCFGSpec(packname, packauth, packver);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FSTools.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
            return null;
        }
    }
}
