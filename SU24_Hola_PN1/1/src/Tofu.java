/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Tofu {
    private String maker;
    private int quantity;

    public Tofu() {
    }

    public Tofu(String maker, int quantity) {
        this.maker = maker;
        this.quantity = quantity;
    }

    public String getMaker() {
        return Character.toLowerCase(maker.charAt(0)) 
                + maker.substring(1, maker.length()-1) 
                + Character.toLowerCase(maker.charAt(maker.length()-1));
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
