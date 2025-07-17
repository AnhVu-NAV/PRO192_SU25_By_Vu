
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class MyPen implements IPen{

    @Override
    public int f1(List<Pen> list) {
        int result = 0;
        for (Pen p: list) {
            int count = 0;
            for (int j = 0; j < p.getName().length(); j++) {
                if(p.getName().charAt(j) == 'A'){
                    ++count;
                }
            }
            if(count >= 2){
                ++result;
            }
        }
        
        return result;
    }

    @Override
    public void f2(List<Pen> list) {
        int min = Integer.MAX_VALUE;
        for(Pen p: list){
            if(min > p.getPrice() && p.getPrice()%2 != 0){
                min = p.getPrice();
            }
        }
        for(Pen p: list){
            if(p.getPrice() == min){
                list.remove(p);
                break;
            }
        }
    }

    @Override
    public void f3(List<Pen> list) {
        for (int i = 2; i <= 6-1; i++) {
            for (int j = i+1; j <= 6; j++) {
                if(list.get(i).getName().compareTo(list.get(j).getName())>0){
                    Pen tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
                if(list.get(i).getName().equals(list.get(j).getName()) 
                        && list.get(i).getPrice() < list.get(j).getPrice()){
                    Pen tmp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tmp);
                }
            }
        }
    }
    
}
