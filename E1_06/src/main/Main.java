/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AnhVuNAV
 */
public class Main {
    public static String simplifyFractions(int a, int b){
        int gcd = gcd(a, b);
        int tu = a/gcd;
        int mau = b/gcd;
        return "" + tu +"/" + mau;
    }
    
    public static int gcd(int a, int b){
        while (b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        System.out.println(simplifyFractions(8, 6));
        System.out.println(simplifyFractions(13, 23));
        System.out.println(simplifyFractions(20, 4));
    }
}
