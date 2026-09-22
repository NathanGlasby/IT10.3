/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package weather;

/**
 *
 * @author admin
 */
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] dailyTemp = new double[7];
        dailyTemp[0] = 23.4; // Day 1
        dailyTemp[1] = 24.6; // Day 2
        dailyTemp[2] = 25.8; // Day 3
        dailyTemp[3] = 23.0; // Day 4
        dailyTemp[4] = 20.9; // Day 5
        dailyTemp[5] = 19.6; // Day 6
        dailyTemp[6] = 18.4; // Day 7
        
        int dayNum = 1;
        
        for (int i = 0; i < 7; i++) {
            System.out.println("Day " + dayNum + ": " + dailyTemp[i]);
                    dayNum++;
        }
        
        double totalTemp = 0;
        
        for (int i = 0; i < dailyTemp.length; i++) {
            totalTemp += dailyTemp[i];
        }
        
        double averageTemp = totalTemp / dailyTemp.length;
                
        System.out.printf(java.util.Locale.US,
        "Average temperature: %.2f degrees C%n", averageTemp);
        
        int lowestDayIndex = 0;

        for (int i = 1; i < dailyTemp.length; i++) {
            if (dailyTemp[i] < dailyTemp[lowestDayIndex]) {
                lowestDayIndex = i;
            }
        }

        System.out.println("Day with the lowest temperature: " + (lowestDayIndex + 1));
        
    }
    
    
}
