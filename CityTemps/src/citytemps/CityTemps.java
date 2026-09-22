/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citytemps;

/**
 *
 * @author admin
 */
public class CityTemps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] cities = new String[10];
        String[] countries = new String[10];
        double[] temps = new double[10];
        
            cities[0] = "New York City";
            countries[0] = "USA";
            temps[0] = 13;

            cities[1] = "London";
            countries[1] = "United Kingdom";
            temps[1] = 11;
            
            cities[2] = "Tokyo";
            countries[2] = "Japan";
            temps[2] = 16;

            cities[3] = "Paris";
            countries[3] = "France";
            temps[3] = 12;

            cities[4] = "Cairo";
            countries[4] = "Egypt";
            temps[4] = 22;

            cities[5] = "Sydney";
            countries[5] = "Australia";
            temps[5] = 18;

            cities[6] = "Rio de Janeiro";
            countries[6] = "Brazil";
            temps[6] = 24;

            cities[7] = "Rome";
            countries[7] = "Italy";
            temps[7] = 16;

            cities[8] = "Cape Town";
            countries[8] = "South Africa";
            temps[8] = 17;

            cities[9] = "Bangkok";
            countries[9] = "Thailand";
            temps[9] = 29;

    for (int i = 0; i < cities.length; i++) {
        System.out.printf(java.util.Locale.US, "%s, %s: %.0f\u00B0C%n", cities[i], countries[i], temps[i]);
    }

    int coldestCity = 0;
    for (int i = 0; i < cities.length; i++) {
        if (temps[i] < temps[coldestCity]) {
            coldestCity = i;
        }
    }
    System.out.println("Coldest city: " + cities[coldestCity] + ", " + countries[coldestCity] + ": " + temps[coldestCity] + " degrees C");

    double totalTemp = 0;
    for (int i = 0; i < temps.length; i++) {
        totalTemp += temps[i];
    }

    double averageTemp = totalTemp / temps.length;
    System.out.printf(java.util.Locale.US, "Average temperature: %.1f degrees C%n", averageTemp);
}
}