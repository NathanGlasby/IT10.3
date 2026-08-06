package glasbynathan_t3practicetest;

import javax.swing.JOptionPane;

/**
 *
 * @author Nathan Glasby
 */
public class GlasbyNathan_T3PracticeTest {

    public static void main(String[] args) {
    
    // Q1
        String school = JOptionPane.showInputDialog("Enter the name of your school.");
        
        if ("Merrifield".equalsIgnoreCase(school == null ? "" : school.trim())) {
            System.out.println("Awesome you're at a good school!");
        } else {
            System.out.println("Have you considered changing to Merrifield?");
        }
    
    // Q2
//    
//        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
//
//        if (age >= 26) {
//            System.out.println("You were born last millenium.");
//        } else {
//            System.out.println("You were born this millenium.");
//        }
//        
//       
    
    // // Q3
    // String firstName = JOptionPane.showInputDialog("Enter first name.");
    // String lastName = JOptionPane.showInputDialog("Enter last night.");

        // Q4
        double mark = Double.parseDouble(
                JOptionPane.showInputDialog("Enter your final mark."));
        String grade = null;
        if (mark >= 80) {
            grade = "A"; }
        else if (mark >= 70) {
            grade = "B"; }
        else if (mark >= 60) {
            grade = "C"; }
        else if (mark >= 50) {
            grade = "D"; }
        else if (mark >= 40) {
            grade = "E"; }
        else {
            grade = "F"; }
        System.out.println("Your grade is " + grade + ".");


    }
}
