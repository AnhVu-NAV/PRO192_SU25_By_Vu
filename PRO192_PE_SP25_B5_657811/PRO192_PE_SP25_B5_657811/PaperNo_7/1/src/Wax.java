/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Wax {
    private String color;
    private int melting;

    public Wax() {
    }

    public Wax(String color, int melting) {
        this.color = color;
        this.melting = melting;
    }

    public String getColor() {
        return "" + this.melting + this.color.substring(1);
    }

    public int getMelting() {
        return melting;
    }

    public void setMelting(int melting) {
        this.melting = melting*3;
    }
    
    
}
