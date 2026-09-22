/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package continentarea;

/**
 *
 * @author admin
 */
public class ContinentArea {

        private String[][] continents = new String[7][2];
        
        public void populate() {
            continents[0][0] = "Asia";
            continents[1][0] = "Africa";
            continents[2][0] = "North America";
            continents[3][0] = "South America";
            continents[4][0] = "Antarctica";
            continents[5][0] = "Europe";
            continents[6][0] = "Oceania";
            
            continents[0][1] = "44.58";
            continents[1][1] = "30.37";
            continents[2][1] = "24.71";
            continents[3][1] = "17.84";
            continents[4][1] = "14.20";
            continents[5][1] = "10.18";
            continents[6][1] = "8.60";
            
        }
        
        public String display() {
            String out = "";
        
            for (int i = 0; i < continents.length; i++) {
            out += continents[i][0] + ": " + continents[i][1] + " square kilometers\n";
            }
        return out;
        }
    }
    
    

