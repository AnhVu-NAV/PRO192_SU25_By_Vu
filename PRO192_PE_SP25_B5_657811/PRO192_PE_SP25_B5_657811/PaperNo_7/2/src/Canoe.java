/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Canoe {
    private String driver;
    private int rate;

    public Canoe() {
    }

    public Canoe(String driver, int rate) {
        this.driver = driver;
        this.rate = rate;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "" + driver + ", " + rate;
    }
}
