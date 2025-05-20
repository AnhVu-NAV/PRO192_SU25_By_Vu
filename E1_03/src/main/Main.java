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
    public static boolean isPrime(int n){
        if( n < 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPrime1(int n){
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return n>1;
    }
    
    
    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
        System.out.println(isPrime(50));
    }
}
