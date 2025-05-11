
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class StandardIO {
    public static void main(String[] args) {
//        System.out.println(""); // tụ dong xuong dong
//        System.out.print(""); // ko xuong dong
//        
//        System.out.println("Xuong dong");
//        System.out.print("KO xuong dong");
//        System.out.println("test \n \t xuong dong");

    /*
    giai thich code
    */
    
    // cac dang du lieu: 3 dang du liau chuan: 
    // số: 9, 9.5, -10,....
    // ký tự: 'a', 'B', '@', '9'
    // logic: true, false
    
    // Chuỗi: "ajhias"
    
    // biến và kieu dữ lieu:
    // - Các kieu du lieu: byte, short, int, long, float, double, char, boolean (kieu du lieu nguyen thuy)
    
//    int a;
//    int b = 9;
//    int c = 1.1; => 

    // kiêu dữ liệu đối tương (class): Byte, Short, Integer, Long, Float, Double, Character, Boolean, String
    
    int a = 10; //=> biến, ko tuong tac đc với biến a
    
    Integer b = 10; //=> đối tượng, có thể tương tác với đối tượng b thông qua toán tử '.'
    
//    a. => ko tương tác
     
//    b. => tuong tac dc

    Integer c = new Integer(10);
     
    int d = 10;
    
    Integer e = 10;
    
    Integer f = new Integer(10);
    
//    System.out.println(a==d);
//    
//    System.out.println(b==e);
//    
//    System.out.println(a==b);
//    
//    System.out.println(c==f);
//    
//    System.out.println(c==b);
    
     // == so sanh dia chi ô nhớ
     
//        System.out.println(c.equals(b));
//        
//        System.out.println(c.equals(f));
        
     // tu khoa "new" dam bao cac đối tượng lưu ở các noi ko trùng nhau
     
     // So đo các kieu du lieu đói tương
     
     
//        printf("%d, %s, %ld,....")
//
//        String name = "Vu";
//        System.out.printf("Toi ten la: %s\n", name);
    
//        int => float
//        float => int 
         
//         System.out.println((float)a);
         
         
//         "+": dấu + trong java

//        System.out.println(1+2); //3 
//        
//        System.out.println(1 + 'a'); // 98
//        
//        System.out.println('a' + 'b'); // 195
//        
//        System.out.println(1 + "Hello"); //1Hello
//         
//        System.out.println('a' + "Hello"); //aHello
//        
//        System.out.println(true + "Hello"); //trueHello 
        
        System.out.println(1+1 + 'a' + "Hello" + 'a' + 2 + (1+10) + "Hello");
        
//        99Helloa211Hello

        Scanner sc = new Scanner(System.in); // nhap vao tu ban phim
        
        System.out.println(a);
        
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        
        System.out.println("A da nhap la: " + a);
    
    }
}
