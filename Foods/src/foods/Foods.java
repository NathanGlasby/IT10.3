/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package foods;

/**
 *
 * @author admin
 */
public class Foods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] favFoods = new String[99];
        String[] personFoods = new String[99];
        
        favFoods[0] = "Pizza";
        personFoods[0] = "Senay";
        
        favFoods[1] = "Venison";
        personFoods[1] = "Reece";
        
        favFoods[2] = "Steak 'n Kidney Pie";
        personFoods[2] = "Nate";
        
        favFoods[3] = "Pap";
        personFoods[3] = "Bulela";
        
        favFoods[4] = "Rati";
        personFoods[4] = "Uvesh";
        
        favFoods[5] = "Gwinya and Nqdyoyo";
        personFoods[5] = "Onako";
        
        favFoods[6] = "Chicken";
        personFoods[6] = "Ntsika";
        
        favFoods[7] = "Kota";
        personFoods[7] = "Amyoli";
        
        favFoods[8] = "Steak";
        personFoods[8] = "Elethu";
        
        int count = 0;
        for (int i = 0; i < favFoods.length; i++) {
            if (favFoods[i] == null) {
                break;
            }
            count++;
            System.out.println(personFoods[i] + "'s favourite food is: " + favFoods[i] + ".");
        }

        String longestName = favFoods[0];
        String person = personFoods[0];
        for (int j = 0; j < count; j++) {
            if (favFoods[j].length() > longestName.length()) {
                longestName = favFoods[j];
                person = personFoods[j];
            }
        }
        System.out.println(person + " has the longest food name: " + longestName);
        System.out.println("Number of meals: " + count);

        int position = -1;
        for (int k = 0; k < count; k++) {
            if (favFoods[k].equals("Pap")) {
                position = k;
                break;
            }
        }
        System.out.println(position);
    }
}
