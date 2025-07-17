/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class MyClass implements IProcess{

    @Override
    public int countWords(String str1, String str2) {
        if(str1.isEmpty() || str2.isEmpty() || str1 == null || str2 == null){
            return 0;
        }
        int count = 0;
        String []words = str1.split(" ");
        for (int i = 0; i < words.length; i++) {
            if(words[i].equalsIgnoreCase(str2)){
                ++count;
            }
        }
        return count;
    }

    @Override
    public String getLastWord(String str) {
        String []words = str.split(" ");
        String reselt = Character.toUpperCase(words[words.length-1].charAt(0)) 
                + words[words.length-1].substring(1);
        return reselt;
    }
    
}
