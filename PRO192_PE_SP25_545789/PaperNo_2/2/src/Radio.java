/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Radio {
    private String content;
    private int rate;

    public Radio() {
    }

    public Radio(String content, int rate) {
        this.content = content;
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "" + content + ", " + rate;
    } 
}
