/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Professor extends Employee{
    private String department;

    public Professor() {
    }

    public Professor(int id, String name, double standardSalary,String department) {
        super(id, name, standardSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
    
    public double calculateActualSalary(){
        double k = 1;
        if(department.equalsIgnoreCase("GD")){
            k = 1.5;
        }
        if(department.equalsIgnoreCase("IT")){
            k = 2;
        }
        return super.getStandardSalary() * k;
    }

    @Override
    public String toString() {
        return "" + super.getId() + ", " + super.getName().toUpperCase() + ", " 
                + department.toUpperCase() + ", " 
                + String.format("%.2f", calculateActualSalary()).replace(",", ".");
    }

    
    
    
}
