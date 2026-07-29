package loginscreen;

import javax.swing.JOptionPane;

public class LoginScreen {

    public static void main(String[] args) {
        String userUserName = "Nate";
        String userPassword = "ThisClass!";
        
        String userName = JOptionPane.showInputDialog("Enter your username.");
        String password = JOptionPane.showInputDialog("Enter your password.");
        
        if (userName.equals(userUserName) && password.equals(userPassword)) {
            System.out.println("Login successful.");
        }
        else {
            System.out.println("Login failed.");
        }
    }
    
}
