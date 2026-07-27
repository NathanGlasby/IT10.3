package vegetarian;

import javax.swing.JOptionPane;

public class Vegetarian {

    public static void main(String[] args) {
        char vegetarian = JOptionPane.showInputDialog(
                "Would you like the vegetarian option (y/n)?").charAt(0);

        if (vegetarian == 'y') {
            System.out.println("Enjoy your soup");
        } else if (vegetarian == 'n') {
            System.out.println("Enjoy your burger");
        } else {
            System.out.println("We only have those two options");
        }
    }
}
