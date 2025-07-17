/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class SpecCanoe extends Canoe{
    private String color;

    public SpecCanoe() {
    }

    public SpecCanoe(String driver, int rate, String color) {
        super(driver, rate);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "" + super.getDriver() + ", " + color + ", " + super.getRate();
    }
    
    public void setData(){
        super.setDriver("" + (super.getRate()%10) + super.getDriver());
    }
    
    public String getValue(){
        if(this.color.startsWith("B") || this.color.charAt(0) == 'Y'){
            return "FAST" + super.getDriver();
        }else{
            return "SLOW" + super.getDriver();
        }
    }
}
