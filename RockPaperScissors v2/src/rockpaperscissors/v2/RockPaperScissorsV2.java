package rockpaperscissors.v2;

import javax.swing.JOptionPane;

public class RockPaperScissorsV2 {
    public static void main(String[] args) {
        int userChoice = Integer.parseInt(JOptionPane.showInputDialog("Enter 1 for rock, 2 for paper, and 3 for scissors."));
        int computerChoice = (int) (Math.random() * 3) + 1;
        
        String userChoiceName = "";
        String computerChoiceName = "";
        
        if (userChoice == 1) {
            userChoiceName = "Rock";
        } else if (userChoice == 2) {
            userChoiceName = "Paper";
        } else if (userChoice == 3) {
            userChoiceName = "Scissors";
        }
        
        if (computerChoice == 1) {
            computerChoiceName = "Rock";
        } else if (computerChoice == 2) {
            computerChoiceName = "Paper";
        } else {
            computerChoiceName = "Scissors";
        }
        
        System.out.println("You Chose: " + userChoiceName);
        System.out.println("(A)I chose: " + computerChoiceName);
        
        if (userChoice == computerChoice) {
            System.out.println("It is a draw!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}