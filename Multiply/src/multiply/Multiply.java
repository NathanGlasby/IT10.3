package multiply;

import javax.swing.JOptionPane;

public class Multiply {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 13);
        int y = (int) (Math.random() * 13);
        int correctAnswer = x * y;
        boolean userCorrect = false;

        while (!userCorrect) {
            String input = JOptionPane.showInputDialog(
                    "Enter the correct answer for " + x + " multiplied by " + y + ".");

            if (input == null) {
                break;
            }

            try {
                int userAnswer = Integer.parseInt(input);

                if (userAnswer == correctAnswer) {
                    JOptionPane.showMessageDialog(null, "You entered the correct answer.");
                    userCorrect = true;
                } else if (userAnswer > correctAnswer) {
                    JOptionPane.showMessageDialog(null,
                            "Incorrect. The correct answer is smaller. Try again.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Incorrect. The correct answer is bigger. Try again.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a whole number.");
            }
        }
    }
}
