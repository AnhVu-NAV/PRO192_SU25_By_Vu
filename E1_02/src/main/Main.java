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
    public static double average( int... a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double)sum/a.length;
    }
    
    public static void main(String[] args) {
        System.out.println(average(1));
        System.out.println(average(1,2,3));
        System.out.println(average(-1, 5, 2, 4, -2, 8));
    }
}
