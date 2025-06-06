/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 *
 * @author AnhVuNAV
 */
public class Validation {
    Scanner sc = new Scanner(System.in);
    public double getInput(String mess){
        System.out.println(mess);
        while(true){
            try{
                double n = Double.parseDouble(sc.nextLine());
                if(n > 0){
                    return n;
                }else{
                    System.out.println("Input must positive number");
                    System.out.println(mess);
                }
            }catch(NumberFormatException e){
                System.out.println("Please input again!!!");
                System.out.println(mess);
            }
        }
    }
}
