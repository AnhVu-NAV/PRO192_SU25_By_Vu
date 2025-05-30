/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class main {
    public static void main(String[] args) {
//        Rectangle rec = new Rectangle();
//        Rectangle rec1 = new Rectangle(rec.width, rec.height);
//        
//        rec.height = 100;
//        rec.width = 1;
//        
//        rec1.height = 20;
//        
////        System.out.println(rec.area());
////        System.out.println(rec.perimeter());
//        System.out.println("Rec: " +rec.toString());
//        System.out.println("Rec1: " +rec1.toString());
//        main m = new main();
//        m.print();

        Person p = new Person("1", "Văn", 20);
        Student s = new Student("SE19000", "Son", 20, 8);
        
        System.out.println(p.toString());
        System.out.println(s.toString());
    }
    
    public void print(){
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle();
        
        rec.setHeight(100);
        rec.setWidth(1);
        
        rec1.setHeight(20);
        
        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());
    }
}
