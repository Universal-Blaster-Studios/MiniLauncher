/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.universalblaster.minilauncher;

import java.awt.GraphicsEnvironment;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 *
 * @author Luke {@literal <luke.m@universalblaster.org>}
 */
public class MiniLauncher {
    
    public static final Logger logger = LogManager.getLogger(MiniLauncher.class);

    public static void main(String[] args) {
        logger.info("Welcome to MiniLauncher.");
        if (isHeadless()) {
            logger.info("Headless environment, proceeding...");
            System.out.println("This is a headless environment!");
        } else {
            logger.info("Graphical environment, proceeding...");
            new SplashScreen().setVisible(true);
        }
    }
    
    public static boolean isHeadless() {
        return GraphicsEnvironment.isHeadless();
    }
}
