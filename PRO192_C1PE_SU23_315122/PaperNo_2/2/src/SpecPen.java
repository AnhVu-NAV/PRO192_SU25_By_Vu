/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class SpecPen extends Pen{
    private int price;

    public SpecPen() {
    }

    public SpecPen(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return ""+ super.toString() + ", " + price;
    }
    
    public void setData(){
        super.setName("" + super.getName() + this.price);
    }
    
    public int getValue(){
        if(super.getColor().contains("Y") || super.getColor().contains("O")){
            return this.price;
        }else{
            return this.price * 2;
        }
    }
    
}
