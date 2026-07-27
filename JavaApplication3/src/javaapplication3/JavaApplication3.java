package javaapplication3;

import javax.swing.JOptionPane;

public class JavaApplication3 {

    public static void main(String[] args) {
        int minimumAge = 17;
        int driverAge = Integer.parseInt(JOptionPane.showInputDialog("Enter age."));
        
        if (driverAge == minimumAge) {
            System.out.println("You are driving with a learners license.");
        }
        else if (driverAge > minimumAge) {
            System.out.println("You are driving with a license.");
        }
        else {
            System.out.println("You're arrested.");
        }    
    }
    
}
