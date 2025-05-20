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
    public static int max(int[] a){
//        int max = (int)-1e9;
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if(max < a[i] && a[i] %2 ==0){
                max = a[i];
            }
        }
        return max;
    }
    
    public static int min(int[] a){
//        int max = (int)-1e9;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        int[] a1 = new int[]{9, 1, 8, 5};
        System.out.println(Main.max(a1));
        int[] a2 = new int[] {12, 28, 42, 36};
        System.out.println(Main.max(a2));
        System.out.println(Main.min(a1));
        System.out.println(Main.min(a2));
    }
}
