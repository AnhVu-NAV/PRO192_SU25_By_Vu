/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class String_LT {
    //D/n:
    // chuoi la 1 day cac ki tự được lưu trong hệ thông
    // tập hợp các pty có cùng kiêu dữ liệu là Character
    
    // Cách khai bá
    String s = new String();
    
    String s1 = "";
    
    
    
    public static void main(String[] args) {
        String s2 = "Hello World";
//        for (int i = 0; i < s2.length(); i++) {
//            if(s2.charAt(i) == 'H'){
//                continue;
//            }
//            System.out.println(s2.charAt(i));
//        }
        
//        System.out.println(s2.charAt(6));
        
        
        // PT So sanh
//        s2.compareTo(); // co phan biet hoa va thuong
//        s2.compareToIgnoreCase() // khong phan biet hoa thuong
                
        String s3 = "lello world";
        
//        System.out.println(s2.compareTo(s3));
//        System.out.println(s2.compareToIgnoreCase(s3));


        // Concat moi giua 2 chuoi lai voi nhau
//        String s4 = s2.concat(s3);
//        System.out.println(s4);
        
        //cantian co chua cai chuoi do ben trong chuoi dc ktra hay ko
        String s5 = "ello";
//        System.out.println(s5.contains(s2));
        
        
        //StartWith, endwith
        s2.startsWith(s5);
        s2.endsWith(s5);
        
        // so sanh bang
        s2.equals(s5);
        s2.equalsIgnoreCase(s5);
        
        //format
        s2.formatted();
        
        //indexOf
        
//        System.out.println(s2.indexOf("ello"));
        
        s2.isEmpty();
        s2.isBlank();
//        
//        // empty
//        s= "";
//        
//        // blank
//        s= " ";
        
        // cat chuoi
//        System.out.println(s2.substring(3));
//        System.out.println(s2.substring(0, 4));
//        Note: endIndex = end-1
        

        // thay the
//        System.out.println(s2.replace("llo", "HHHHH"));
        
        
        // tach chuoi
        String[] taken = s2.split("o");
        for (int i = 0; i < taken.length; i++) {
//            System.out.println(taken[i]);
        }
        
        System.out.println(s2.toCharArray());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.toUpperCase());
        
        
        StringBuilder s6 = new StringBuilder(s2);
        
//        System.out.println(s6.replace(2, 3, s5));
        
//        s6.insert(0, s5);
//        System.out.println(s6.insert(0, s5));
//        s6.delete(0, 1);
        
        System.out.println(s6.reverse());
        
        String s7 = "a1a";
//        StringBuilder s8 = new StringBuilder(s7);
//        if(s7.equals(s8.reverse().toString())){
//            System.out.println("Chuoi doi xung");
//        }else{
//            System.out.println("ko doi xung");
//        }
//        
        System.out.println(checkChuoiDoiXung(s7));
        
        //phuong thuc - ham trong c (method)
//        2 loai: pt tra ve gtri va pt ko tra ve tri
//        ko tra ve gtri: void
        
        
    }
    
//    public static <KDL> <TEN PT> (Tham so dau vao){
//        //nd pt
//    }
    
    public static boolean checkChuoiDoiXung (String s){
        StringBuilder s8 = new StringBuilder(s);
        if(s.equals(s8.reverse().toString())){
            return true;
        }
        return false;
    }
}
    
//    1 lon hon
//    0 la bang
//    -1 nho hon
