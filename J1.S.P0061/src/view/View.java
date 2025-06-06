/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Triangle;

/**
 *
 * @author AnhVuNAV
 */
public class View {
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        rec.input();
        Shape circle = new Circle();
        circle.input();
        Shape triangle = new Triangle();
        triangle.input();
        View v = new View();
        v.display(rec, circle, triangle);
    }
    
    public void display(Shape rec, Shape circle, Shape triangle){
        rec.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
