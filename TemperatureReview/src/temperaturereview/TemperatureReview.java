package temperaturereview;

import javax.swing.JOptionPane;

public class TemperatureReview {

    public static void main(String[] args) {
        double temperature = Double.parseDouble(
                JOptionPane.showInputDialog("Enter the current temperature outside."));

        if (temperature <= 0) {
            System.out.println("It's freezing!");
        } else if (temperature < 10) {
            System.out.println("It's cold.");
        } else if (temperature < 20) {
            System.out.println("It's cool.");
        } else if (temperature < 30) {
            System.out.println("It's warm.");
        } else {
            System.out.println("It's hot!");
        }
    }
}
