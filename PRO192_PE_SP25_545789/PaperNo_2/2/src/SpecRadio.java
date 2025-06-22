/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class SpecRadio extends Radio{
    private String chanel;

    public SpecRadio() {
    }

    public SpecRadio(String content, int rate, String chanel) {
        super(content, rate);
        this.chanel = chanel;
    }

    public String getChanel() {
        return chanel;
    }

    @Override
    public String toString() {
        return "" + super.getContent() + ", " + chanel + ", " + super.getRate();
    }
    
    public void setData(){
        int index = 0;
        for (int i = 0; i < super.getContent().length(); i++) {
            if(Character.isDigit(super.getContent().charAt(i))){
                index = i;
                break;
            }
        }
        super.setContent(super.getContent().substring(0, index) 
                + super.getContent().substring(index+1));
    }
    
    public String getValue(){
        if(super.getRate() %2 != 0){
            String result = "";
            for (int i = 0; i < super.getContent().length(); i++) {
                if(i%2 == 0){
                    continue;
                }
                result += super.getContent().charAt(i);
            }
            return result;
        }else{
            return super.getContent();
        }
    }
}
