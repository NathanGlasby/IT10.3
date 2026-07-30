package rockpaperscissors;

import javax.swing.JOptionPane;

public class RockPaperScissors {
    public static void main(String[] args) {
        boolean rock = false;
        boolean paper = false;
        boolean scissors = false;
        
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for rock, 2 for paper, and 3 for scissors."));
        int computerChoice = (int) (Math.random() * 3) + 1;
        System.out.println(computerChoice);
    }
    
}
