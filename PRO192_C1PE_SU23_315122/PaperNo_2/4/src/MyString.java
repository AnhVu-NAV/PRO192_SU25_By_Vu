/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class MyString implements IString {

    @Override
    public int f1(String string) {
        String[] words = string.split(" ");
        int result = 0;
        for (int i = 0; i < words.length; i++) {
            int count = 0;
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == 'u'
                 || words[i].charAt(j) == 'e'
                 || words[i].charAt(j) == 'o'
                 || words[i].charAt(j) == 'a'
                 || words[i].charAt(j) == 'i') {
                    ++count;
                }
            }
            if (words[i].length() - count >= 2) {
                ++result;
            }
        }
        return result;
    }

    @Override
    public String f2(String string) {
        
        //loai bo ki tu dac biet
        String s = "";
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLetter(string.charAt(i))){
                s += "" + Character.toLowerCase(string.charAt(i));
            }
        }
        
        // dem tan xuat xuat hien cua ca ki tu
        int count[] = new int[255];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if(count[i] > max){
                max = count[i];
            }
        }
        String result = "";
        if(max == 1){
           result = "NO"; 
        }else{
           for (int i = 26-1; i >= 0; i--){
                if(count[i] == max){
                    result += "" + (char)(i + 'a');
                }
            } 
        }
        
        return result;
    }

}
