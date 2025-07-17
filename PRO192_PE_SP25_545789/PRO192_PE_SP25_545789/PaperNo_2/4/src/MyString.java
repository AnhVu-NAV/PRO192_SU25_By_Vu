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
        int count[] = new int[10]; // dem so lan xuat hien cua so
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                count[string.charAt(i) - '0']++;
            }
        }

        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if (max <= count[i]) {
                max = count[i];
                result = i;
            }
        }
        return result;
    }

    @Override
    public String f2(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            String num = "";
            int index = i;
            if (Character.isDigit(string.charAt(i))) {
                for (int j = i; j < string.length(); j++) {
                    if (Character.isDigit(string.charAt(j))) {
                        num += "" + string.charAt(j);
                        index = j;
                    } else {
                        break;
                    }
                }
                StringBuilder s = new StringBuilder(num);
                result += s.reverse().toString();
                i = index;
            } else {
                result += "" + string.charAt(i);
            }

        }
        return result;
    }

}
