/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colections;

import java.util.*;

/**
 *
 * @author AnhVuNAV
 */
public class Colections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<Integer> num = new ArrayList<>();
//        
//        num.add(1);
//        num.add(9);
//        num.add(1000);
//        num.add(1);
//        num.add(44);
//        num.add(-10);
//        
//        System.out.println(num);
//        Collections.sort(num); // tang dan
//        
//        System.out.println(num);
//        
//        for (int i = 0; i < num.size()-1; i++) {
//            for (int j = i+1; j < num.size(); j++) {
//                if(num.get(i) > num.get(j)){
//                    Integer tmp = num.get(i);
//                    num.set(i, num.get(j));
//                    num.set(j, tmp);
//                }
//            }
//        }
//        
//       Collections.sort(num, Collections.reverseOrder());
//        System.out.println(num);
        
        List<Product> product = new ArrayList<>();
        product.add(new Product("BLapTop", 1000, 10));
        product.add(new Product("APhone", 800, 10));
        product.add(new Product("DTablet", 500, 5));
        product.add(new Product("CHeadphone", 10, 100));
        
        System.out.println(product);
        
//        Collections.sort(product, new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        
        int index = Collections.binarySearch(product, new Product("APhone", 0, 0),
                Comparator.comparing(Product::getName));
        
        
        System.out.println(index);
    }
    
}
