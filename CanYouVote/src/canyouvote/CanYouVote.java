package canyouvote;

import javax.swing.JOptionPane;

public class CanYouVote {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        String citizenStatus = JOptionPane.showInputDialog("Are you a South African citizen? (y/n)");
        String identification = JOptionPane.showInputDialog("Which identification do you have (drivers licence, id book or passport)?");
        
        boolean hasValidIdentification = identification.equalsIgnoreCase("drivers licence") || identification.equalsIgnoreCase("id book") || identification.equalsIgnoreCase("passport");
        
        if (age >= 18 && citizenStatus.equalsIgnoreCase("y") && hasValidIdentification) {
            System.out.println("You can vote in South African elections.");
        } else {
            System.out.println("You cannot vote in South African elections.");
        }
    }
}