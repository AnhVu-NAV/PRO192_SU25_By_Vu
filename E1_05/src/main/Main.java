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
    public static boolean isArmstrongNumber(int n){
        int sum = 0;
        int temp = n;
        
//        int digits = String.valueOf(n).length();
        int digits = (n+"").length();
        
        while(temp != 0){
            int digit = temp%10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        return sum == n;
    }
    
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        System.out.println(isArmstrongNumber(423));
        System.out.println(isArmstrongNumber(371));
        System.out.println(isArmstrongNumber(2415));     
    }
}
