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
    private double standardSalary;

    public Employee() {
    }

    public Employee(int id, String name, double standardSalary) {
        this.id = id;
        this.name = name;
        this.standardSalary = standardSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getStandardSalary() {
        return standardSalary;
    }
    
    
}
