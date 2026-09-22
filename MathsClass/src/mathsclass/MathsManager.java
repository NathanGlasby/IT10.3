/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mathsclass;

/**
 *
 * @author admin
 */
public class MathsManager {
   int[] numbers = new int[10];
   
   public void populate() {
       numbers[0] = 1;
       numbers[1] = 2;
       numbers[2] = 3;
       numbers[3] = 4;
       numbers[4] = 5;
       numbers[5] = 6;
       numbers[6] = 7;
       numbers[7] = 8;
       numbers[8] = 9;
       numbers[9] = 10;
       
       }
    public String display() {
        String out = "";
        for (int i = 0; i < numbers.length; i++) {
            out = numbers[i] + out;
        }
        return out;
        
//        int total = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            total = numbers[i] + total;
//        }
//       String allValues = total + "";
   }
    
    public String squares() {
        for (int i = 0; i < numbers.length; i++) {
            
        }
        return ""; // Exercise still unfinished.
    }
}
