package ticketdiscount;

import javax.swing.JOptionPane;

public class TicketDiscount {

    public static void main(String[] args) {
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter your age."));

        if (age <= 12) {
            System.out.println("The ticket price is R25.00");
        } else if (age <= 17) {
            System.out.println("The ticket price is R35.00");
        } else if (age < 65) {
            System.out.println("The ticket price is R50.00");
        } else {
            System.out.println("The ticket price is R40.00");
        }
    }
}
