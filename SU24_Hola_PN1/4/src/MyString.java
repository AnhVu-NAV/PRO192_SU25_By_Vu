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
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                String num = "";
                int index = 0;
                for (int j = i; j < string.length(); j++) {
                    if (Character.isDigit(string.charAt(j))) {
                        num += "" + string.charAt(j);
                        ++index;
                    } else {
                        break;
                    }
                }
                if (Integer.parseInt(num) % 2 != 0) {
                    sum += Integer.parseInt(num);
                }
                i += index;
            }
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        String[] taken = string.split(" ");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < taken.length; i++) {
            if (taken[i].length() > max) {
                max = taken[i].length();
            }
        }

        for (int i = 0; i < taken.length; i++) {
            if (taken[i].length() == max) {
                StringBuilder s = new StringBuilder(taken[i]);
                s.reverse();
                taken[i] = s.toString();
                break;
            }
        }
        
        String result = "";
        for (int i = 0; i < taken.length; i++) {
            result += taken[i] + " ";
        }
        
        return result.trim();
    }
}
