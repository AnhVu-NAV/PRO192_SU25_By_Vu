/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class MyString implements IString{

    @Override
    public int f1(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            String num = "";
            int index = 0;
            if(Character.isDigit(string.charAt(i))){
                for (int j = i; j < string.length(); j++) {
                    if(Character.isDigit(string.charAt(j))){
                            num += "" + string.charAt(j);
                            index = j;
                    }else{
                        break;
                    }
                }
                if(num.charAt(num.length()-1) != '3'){
                    sum += Integer.parseInt(num);
                }
                i = index;
            }
        }
        return sum;
    }
    

    @Override
    public String f2(String string) {
       int min = Integer.MAX_VALUE;
       int count = 0;
       int indexMin = 0;
       String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if(Character.isLowerCase(words[i].charAt(j))){
                    ++count;
                }
            }
            if(count <= min){
                min = count;
                indexMin = i;
            }
        }
        return words[indexMin].toUpperCase();
    }
    
}
