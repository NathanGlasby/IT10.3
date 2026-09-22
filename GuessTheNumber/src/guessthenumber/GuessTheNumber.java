/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessthenumber;

import javax.swing.JOptionPane;

public class GuessTheNumber {

    public static void main(String[] args) {
        
        // Nate's Successful Attempt
                double randomNum = Math.random() * 100;
                int randomNumInt = (int) randomNum;
                System.out.println("The secret number is " + randomNumInt + ".");
                boolean userGuessed = false;
                int userGuesses = 0;

                while (!userGuessed) {            
                    int userGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess of the secret number."));

                    if (userGuess != randomNumInt) {
                        userGuesses += 1;
                        System.out.println("Incorrect number. Amount of guesses so far:" + userGuesses);
                        userGuessed = false;
                    } else {
                        System.out.println("You correctly guessed that the secret number is " + randomNumInt + ".");
                        userGuessed = true;
                    }
                }
        
        // Teacher Memo
                int secretNum = (int) (Math.random() * 100) + 1;
                int userGuessV2 = Integer.parseInt(JOptionPane.showInputDialog("Enter secret number."));
                int guessCount = 0;
                
                System.out.println(secretNum);
                
                while (userGuessV2 != secretNum) {
                    guessCount++;
                    
                    if (userGuessV2 > secretNum) {
                        userGuessV2 = Integer.parseInt(JOptionPane.showInputDialog("The number is lower. Enter another guess."));
                    } else if (userGuessV2 < secretNum) {
                        userGuessV2 = Integer.parseInt(JOptionPane.showInputDialog("The number is higher. Enter another guess."));
                    }
        }
        System.out.println("You gussed it in " + guessCount + " attempts.");         
    }
    
}
