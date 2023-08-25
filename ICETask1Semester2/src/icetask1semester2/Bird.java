/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1semester2;

/**
 *
 * @author Ahmed Kader
 */
public class Bird extends Animal {
    
private String featherColour;
    private int colour;


    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour = colour;
    }
 @Override
    public void Input() {
        super.Input();
    switch (colour) {
        case 1:
            featherColour="Grey";
            break;
        case 2:
            featherColour="White";
            break;
        case 3:
            featherColour="Black";
            break;
        default:System.out.println("Incorrect colour");break;
    }
     }
    
    @Override
    public void Output() {
        super.Output();
        
            System.out.println("Feather Colour: " + featherColour);
        }
    }

