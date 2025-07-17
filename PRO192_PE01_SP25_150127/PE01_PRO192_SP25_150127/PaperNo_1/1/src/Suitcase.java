/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Suitcase {
    private int id;
    private String name;
    private double capacity;
    private int maxWeight;

    public Suitcase() {
    }

    public Suitcase(int id, String name, double capacity, int maxWeight) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    public double expandSuitcase(){
        if(maxWeight >= 15){
            return capacity + 5;
        }else if(maxWeight > 7){
            return capacity + 2;
        }else{
            return capacity;
        }
    }

    @Override
    public String toString() {
        return "" + id + ", " + name.toUpperCase() + ", " 
                + String.format("%.2f", capacity).replace(",", ".") 
                + ", " + maxWeight;
    }
    
    
}
