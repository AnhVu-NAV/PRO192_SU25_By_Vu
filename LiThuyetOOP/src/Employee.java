/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Employee extends Person{

    public Employee() {
    }

    public Employee(String id, String name, int age) {
        super(id, name, age);
    }
    
    

    @Override
    public String toString() {
        return "Employee{" + "id=" + super.getId() + ", name=" + super.getName() + ", age=" + super.getAge() +'}';
    }
    
    
}
