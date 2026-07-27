package oddoreven;

import javax.swing.JOptionPane;

public class OddOrEven {

    public static void main(String[] args) {
        int number = Integer.parseInt(
                JOptionPane.showInputDialog("Enter an integer."));

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }
}
