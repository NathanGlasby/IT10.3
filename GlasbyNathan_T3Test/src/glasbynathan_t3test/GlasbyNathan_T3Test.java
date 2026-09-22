/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glasbynathan_t3test;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class GlasbyNathan_T3Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Q1
        String answer = JOptionPane.showInputDialog("Enter the correct term for computer memory.");
        
        if (answer.equals("RAM")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect.");
        }
    
System.out.println();

    // Q2
        int storageSize = Integer.parseInt(JOptionPane.showInputDialog("Enter the storage size of your HDD in gigabytes. (e.g. 512)"));

        if (storageSize >= 1000) {
            System.out.println("The HDD size is a 1TB or more.");
        } else {
            System.out.println("The HDD size is less than 1TB.");
        }

System.out.println();

    // Q3
        String resolution = JOptionPane.showInputDialog("Enter your screen resolution. (e.g. HD)");

        if (resolution.equals("HD")) {
            System.out.println(resolution + " is 1280 x 720 pixels.");
        } else if (resolution.equals("Full HD")) {
            System.out.println(resolution + " is 1920 x 1080 pixels.");   
        } else if (resolution.equals("4K")) {
            System.out.println(resolution + " is 3840 x 2160 pixels.");    
        } else {
            System.out.println(resolution + " is not recognised.");
        }
      
System.out.println();

    // Q4
    int cpuOne = Integer.parseInt(JOptionPane.showInputDialog("Enter the speed of your first CPU in GHz. (e.g. 2000)"));
    int cpuTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter the speed of your second CPU in GHz. (e.g. 5000)"));  

    if (cpuOne > cpuTwo) {
        System.out.println("A CPU speed of " + cpuOne + " GHz is faster than " + cpuTwo + " GHz");
    } else if (cpuOne < cpuTwo) {
        System.out.println("A CPU speed of " + cpuOne + " GHz is slower than " + cpuTwo + " GHz");
    } else {
        System.out.println("Both CPUs are the same speed of " + cpuOne + " GHz.");
    }
}
    }

