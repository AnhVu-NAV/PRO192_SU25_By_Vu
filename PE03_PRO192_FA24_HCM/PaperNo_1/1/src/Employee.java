/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Employee {
    private int id;
    private String name;
    private double salary;
    private int seniority;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int seniority) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;
    }

    public void setSeniority(int seniority) {
        if(seniority <= 0){
           this.seniority = 1;
        }else{
           this.seniority = seniority; 
        }
    }

    @Override
    public String toString() {
        return "" + id + ", " + name + ", " + salary + ", " + seniority;
    }
    
    public void updateSalary(){
        if(this.seniority >= 3 && this.seniority <= 5){
            this.salary = this.salary + this.salary*0.3;
        }else if(this.seniority >= 6 && this.seniority <= 10){
            this.salary = this.salary + this.salary*0.5;
        }else{
            this.salary = this.salary + this.salary;
        }
    }
}
