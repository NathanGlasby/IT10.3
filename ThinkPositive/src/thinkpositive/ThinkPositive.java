package thinkpositive;

import javax.swing.JOptionPane;

public class ThinkPositive {

    public static void main(String[] args) {
        double number = Double.parseDouble(
                JOptionPane.showInputDialog("Enter a number."));

        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
