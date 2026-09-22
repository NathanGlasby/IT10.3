package shoppingbasket;

import javax.swing.JOptionPane;

public class ShoppingBasket {

    public static void main(String[] args) {
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price."));
        double total = 0;
        double highest = price;

        while (price != 0) {

            if (price > highest) {
                highest = price;
            }

            total = total + price;
            JOptionPane.showMessageDialog(null, "The total is R" + total);
            price = Double.parseDouble(JOptionPane.showInputDialog("Enter the item price."));
        }

        System.out.println("The total is R" + total);
        System.out.println("The highest price was R" + highest);
    }

}
