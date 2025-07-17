/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Eagle {
    private String type;
    private int quantity;

    public Eagle() {
    }

    public Eagle(String type, int quantity) {
        this.type = type;
        this.quantity = quantity;
    }

    public String getType() {
        return "" + this.type.charAt(this.type.length()-1) + this.type.charAt(1);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}
