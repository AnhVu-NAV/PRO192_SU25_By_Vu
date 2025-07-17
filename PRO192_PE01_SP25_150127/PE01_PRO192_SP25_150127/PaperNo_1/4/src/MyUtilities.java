/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class MyUtilities implements IUtilities{

    @Override
    public int getLengthOfLongestWord(String string) {
        String[] words = string.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > max){
                max = words[i].length();
            }
        }
        return max;
    }

    @Override
    public double calculateAverageValue(String string) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if(Character.isDigit(string.charAt(i)) && (string.charAt(i)-'0')%2 == 0){
                sum += (string.charAt(i)-'0');
                ++count;
            }
        }
        return sum/count;
    }
    
}
