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
    public static boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i==0){
                sum += i;
            }
        }
        return sum == n;
    }
    
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(18));
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(26));
    }
}
