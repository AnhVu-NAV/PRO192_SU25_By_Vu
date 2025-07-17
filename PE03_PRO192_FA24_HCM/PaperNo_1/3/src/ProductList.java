
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class ProductList extends ArrayList<Product>{
    public Product getProductById(int id){
//        for (int i = 0; i < this.size(); i++) {
//            if(this.get(i).getId() == id){
//                return this.get(i);
//            }
//        }
        for(Product p: this){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    public Product getProductWithMinPrice(){
//        Product min = this.get(0);
//        for(Product p : this){
//            if(p.getPrice() < min.getPrice()){
//                min = p;
//            }
//        }
//        return min;
        double min = Integer.MAX_VALUE;
        Product result = null;
        for(Product p : this){
            if(p.getPrice() < min){
                min = p.getPrice();
                result = p;
            }
        }
        return result;
    }
}
