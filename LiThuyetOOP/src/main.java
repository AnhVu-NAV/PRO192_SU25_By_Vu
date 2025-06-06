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

        //D/n: tinh đa hình *polymorphism
        // cho phep đối tượng sẽ có thể ở nhieuefg hình dạng hoặc thực hiện các 
        // hành vi giông nhau nhưng cách hoạt động khác nhau
//        Person p = new Person("1", "Văn", 20);
//        Person s = new Student("SE19000", "Son", 20, 8);
//        Person e = new Employee("1", "Văn", 20);
//        Person f = new Fresher("1", "Văn", 20);
//        System.out.println(p.toString());
//        System.out.println(s.toString());
//        System.out.println(e.toString());
//        System.out.println(f.toString());
//        System.out.println(e instanceof Fresher);
        Remote vn = new RemoteVN();
        Remote jp = new RemoteJP();

        vn.next();
        jp.next();

    }

    public void print() {
        Rectangle rec = new Rectangle();
        Rectangle rec1 = new Rectangle();

        rec.setHeight(100);
        rec.setWidth(1);

        rec1.setHeight(20);

        System.out.println(rec.getWidth());
        System.out.println(rec.getHeight());

    }

    //Abstraction (Trừu tượng)
    // d/n: pp giup an đi các chi tiết cụ thể của 1 đói tượng
    // tập ytung vào việc khai báo các hành vi của chung
}
