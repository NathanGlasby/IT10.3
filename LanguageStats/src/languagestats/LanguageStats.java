/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package languagestats;

/**
 *
 * @author admin
 */
public class LanguageStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LanguageManager lm = new LanguageManager();
        lm.populateLanguages();
        lm.populatePercentages();
        System.out.print(lm.display());
      
    }
    
}
