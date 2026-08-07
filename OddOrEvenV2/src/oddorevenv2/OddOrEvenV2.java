/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oddorevenv2;

/**
 *
 * @author natha
 */
public class OddOrEvenV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Q1: Odd or Even Number
        
        int num = 25;
                
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        s
    // Q2: Check whether num1 divided num2 has a remainder.
        int num1 = 7;
        int num2 = 3;
    
        if (num1 % num2 == 0) {
            System.out.println(num1 + " divided " + num2 + " has no remainder.");
        } else {
            System.out.println(num1 + " divided " + num2 + " has a remainder.");
        }
        
    // Q3: Between two strings what is alohabetical order.
        String nameOne = "Bulela";
        String nameTwo = "Butch";
        
        System.out.println(nameOne.compareTo(nameTwo));
    }
    
}
