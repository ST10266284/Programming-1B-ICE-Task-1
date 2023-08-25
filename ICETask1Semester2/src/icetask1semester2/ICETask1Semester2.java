/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1semester2;

/**
 *
 * @author Ahmed Kader
 */
public class ICETask1Semester2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);
        
        System.out.println("Bird Input Record: ");
        brd.Input();
        System.out.println("\nReptile Input Record: ");
        rept.Input();
        System.out.println("\nBird:");
        brd.Output();
        System.out.println("\nReptile:");
        rept.Output();
    }
}