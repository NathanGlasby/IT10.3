/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package languagestats;

/**
 *
 * @author admin
 */
public class LanguageManager {
    private String[] languages = new String[12];
    private double[] percentages = new double[12];
    double signedPer = 0;
    double cent = 100;
    
    public void populateLanguages() {
        languages[0] = "Afrikaans";
        languages[1] = "English";
        languages[2] = "Sepedi";
        languages[3] = "Sosotho";
        languages[4] = "Setswana";
        languages[5] = "siSwati";
        languages[6] = "South African Sign Language";
        languages[7] = "Tshivenda";
        languages[8] = "isiNdebele";
        languages[9] = "isiXhosa";
        languages[10] = "isiZulu";
        languages[11] = "Xitsonga";
    }
    
    public void populatePercentages() {
        percentages[0] = 10.6;
        percentages[1] = 8.7;
        percentages[2] = 10.0;
        percentages[3] = 7.8;
        percentages[4] = 8.3;
        percentages[5] = 2.8;
        percentages[6] = 0;
        percentages[7] = 2.5;
        percentages[8] = 1.7;
        percentages[9] = 16.3;
        percentages[10] = 24.4;
        percentages[11] = 4.7;
        
        for (int i = 0; i < percentages.length; i++) {
            signedPer = signedPer + percentages[i];
        }
        percentages[6] = cent - signedPer;
    }
    
    public String display() {
        String lanOutput = "";
        for (int i = 0; i < percentages.length; i++) {
            lanOutput += languages[i] + " " + String.format("%.1f", percentages[i]) + "%\n";
        }
        return lanOutput;
    }
    
}
