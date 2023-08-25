/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1semester2;

/**
 *
 * @author Ahmed Kader
 */
public class Reptile extends Animal {
    
 private double bloodTemp;

    public Reptile(int IDtag, String species, double bloodTemp) {
        super(IDtag, species);
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.println("\nEnter blood temperature of the reptile:");
        bloodTemp = kb.nextDouble();
    }
     @Override
    public void Output() {
        super.Output();
        System.out.println("Blood Temperature: " + bloodTemp);
    }
}
