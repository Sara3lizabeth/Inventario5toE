/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.PanelInventory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        // Print the greeting to the console
        System.out.println(new App().getGreeting());
        
        // Assuming 'Okay' is a JFrame, create an instance of it
        okay okFrame = new okay();
        
        // Set the frame to be visible
        okFrame.setVisible(true);
        
        // Optionally, set default close operation for the frame
        okFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   
    }
}
