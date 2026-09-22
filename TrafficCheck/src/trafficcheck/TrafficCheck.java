/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trafficcheck;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class TrafficCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minimumAge = 17;
        String input = JOptionPane.showInputDialog("Enter your age:");

        if (input == null) {
            return;
        }

        int driverAge;
        try {
            driverAge = Integer.parseInt(input.trim());
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Please enter a valid whole number.");
            return;
        }

        if (driverAge >= minimumAge) {
            System.out.println("You can drive");
        } else {
            System.out.println("You're arrested!");
        }
    }
}
