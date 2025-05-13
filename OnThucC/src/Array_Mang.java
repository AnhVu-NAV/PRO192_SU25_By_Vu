
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Array_Mang {
    public static void main(String[] args) {
        //d/n: cấu trúc dữ liệu để lưu trữ một tập hợp các phần tử cùng kiểu dữ liệu
        // hạt động với cả kiểu nguyên thủy vfa kiểu class
        
        // mảng n phần tử: các phần tử đc đánh số từ  0 đến n-1
        // đặc điểm của mảng:
        // - có số lượng ptu cố đỉnh
        // - không thể thêm mới phẩn tử
        // - không thể xóa các phân tử
        // - có thể thay đổi/ truy xuất giá trị các ptu qua chi số mảng
        
        // Mảng trong java là 1 đói tựng nên khi khởi tạo bắt buộc phải dùng từ kháo "NEW"
        // có thể tg tac với mảng
        
        // mảng 1 chiều
        int []a = new int [] {1,4,5,8,3};
        
        String s[] = new String[] {"aaaa", "abcde", "BBBBB"};
        
        
        // duyệt mảng:
//        for (int i = 0; i < a.length-1; i++) {
//            // có nhiêm vụ với mảng
//            if(a[i] %2 == 0){
//                System.out.println(a[i]);
//            }
//        }
        //for-each
//        for(String chuoi: s){
//            if(chuoi.length() > 4){
//                System.out.println(chuoi);
//            }
//        }
        
        // mang 2 chieu
//        int[][] c = new int [5][];
//        
//        1 2 3 4 5 
//        1 2 3 
//        1 2 3 4 5
//        1 2 3 
//        1 2 3 4 5
        
//        for (int i = 0; i < c.length; i++) {
//            for (int j = 0; j < c[i].length; j++) {
//                
//            }
//        }
//        c.length số hàng của ma trận
//        c[i].length số ptu trong 1 hàng
        

        int[] a1= new int[]{1,2,3};
        int[] b = a1.clone();
        
        
        System.out.println(a1[1]);
        a1[1] = 10;
        System.out.println(a1[1]);
        System.out.println(b[1]);
        
        // Array List
//        d/n: đối tượng dùng để biểu diễn một mảng động để lưu trữ các ptu có cùng kiểu dữ liệu
        // 0 -> n-1 mang có n ptu
        // đắc điểm: 
        // - có só lương ptu lin hoạt
        // có thể thêm, bớt(xóa)
        // có thay đổi qua chi số (index)
        
        // đi với kiếu dữ liệu đối tượng
        
        ArrayList<String> works = new ArrayList<String>();
        
        works.get(0);
        works.set(0, "ABC");
        works.remove(0);
        works.indexOf("ABC");
        works.size(); 
        
    }
}
