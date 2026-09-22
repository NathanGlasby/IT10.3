package olympicsprint;

import javax.swing.JOptionPane;

public class OlympicSprint {
    public static void main(String[] args) {
        double raceTime = Double.parseDouble(JOptionPane.showInputDialog("Enter the race time of the sprinter in seconds."));
        double lowestTime = 0;
        
        while (raceTime != 0) {
            
            if (raceTime > lowestTime) {
                lowestTime = raceTime;
                
            raceTime = Double.parseDouble(JOptionPane.showInputDialog("Enter the race time of the sprinter in seconds."));
            }
        }
        
        System.out.println("The best time was " + lowestTime);
    }
    
}
