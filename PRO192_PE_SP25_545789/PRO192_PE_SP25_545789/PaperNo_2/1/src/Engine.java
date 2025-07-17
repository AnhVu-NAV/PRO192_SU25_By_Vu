/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Engine {
    private String designer;
    private int power;

    public Engine() {
    }

    public Engine(String designer, int power) {
        this.designer = designer;
        this.power = power;
    }

    public String getDesigner() {
        return designer.substring(0, 2) + this.power + designer.substring(2);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        int n = 0;
        for (int i = 0; i < this.designer.length(); i++) {
            if(Character.isLetter(this.designer.charAt(i))){
                ++n;
            }
        }
        this.power = power * n;
    }
    
    
}
