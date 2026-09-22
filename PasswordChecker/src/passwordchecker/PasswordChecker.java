/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordchecker;

import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String password = "3tm31n";
        
        String userPassword = JOptionPane.showInputDialog("Enter your password.");
        
            if (userPassword.equals(password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login unsuccessful.");
            }
    }
    
}
