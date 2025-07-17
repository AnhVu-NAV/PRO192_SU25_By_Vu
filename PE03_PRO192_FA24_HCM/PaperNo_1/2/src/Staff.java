/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Staff {
    private int id;
    private int salary;

    public Staff() {
    }

    public Staff(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        if(salary < 1000){
            this.salary = 1000;
        }else{
            this.salary = salary;
        }
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "" + id + ", " + salary;
    }
    
    
}
