/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1semester2;

import java.util.Scanner;

/**
 *
 * @author Ahmed Kader
 */
public class Animal {
    
Scanner kb = new Scanner(System.in);
    private int IDtag;
    private String species;

    public Animal(int IDtag, String species) {
        this.IDtag = IDtag;
        this.species = species;
    }

    public void Input() {
        System.out.println("Enter ID tag number:");
        IDtag = kb.nextInt();
        kb.nextLine();
        System.out.println("\nEnter name of species:");
        species = kb.nextLine();
    }
     public void Output() {
        System.out.println("Recorded details:");
        System.out.println("ID tag number: " + IDtag);
        System.out.println("Species: " + species);
    }
}
