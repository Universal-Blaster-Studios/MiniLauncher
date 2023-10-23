/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.universalblaster.minilauncher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Luke M <luke.m@universalblaster.org>
 */
public class RustBridge {
    public static void initNetBridge() {
        try {
        // Define the command and arguments to execute the external application
        ProcessBuilder processBuilder = new ProcessBuilder("command", "arg1", "arg2");

        // Set the working directory if needed
        // processBuilder.directory(new File("path/to/working/directory"));
        // Start the external process
        Process process = processBuilder.start();

        // Read the process's stdout
        InputStream inputStream = process.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println("NetBridge: " + line); // Print the output
        }

        // Wait for the process to complete
        int exitCode = process.waitFor();
        System.out.println("Exit Code: " + exitCode);
        }
        catch (IOException | InterruptedException e) {
                e.printStackTrace();
        }
    }
}
