
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class WatchList extends ArrayList<Watch>{

    public WatchList() {
    }
    
    public void addWatch(Watch watch){
        this.add(watch);
    }
    
    public WatchList filterByBrand (String value){
        WatchList watchFilter =  new WatchList();
        for (Watch w: this) {
            if(w.getBrand().equalsIgnoreCase(value)){
                watchFilter.add(w);
            }
        }
        if(watchFilter.isEmpty()){
            return null;
        }
        return watchFilter;
    }
    
    public Watch findMostExpensive(){
        Watch maxWatch = this.get(0);
        for(Watch w: this){
            if(w.getPrice() > maxWatch.getPrice()){
                maxWatch = w;
            }
        }
        return maxWatch;
    }
}
