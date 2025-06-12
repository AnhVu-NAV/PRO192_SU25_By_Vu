/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Employee;
import models.EmployeeModel;

/**
 *
 * @author AnhVuNAV
 */
public class EmployeeController {

    private EmployeeModel employeeModel;

    public EmployeeController() {
        employeeModel = new EmployeeModel();
    }

    public EmployeeModel getEmployeeModel() {
        return employeeModel;
    }

    public void setEmployeeModel(EmployeeModel employeeModel) {
        this.employeeModel = employeeModel;
    }

    public void create(Employee creatingEmployee){
        if(employeeModel.create(creatingEmployee)){
            System.out.println("Create success!");
        }else{
            System.out.println("Create failed!");
        }
    }

    public void update(Employee updatingEmployee){
        if(employeeModel.update(updatingEmployee)){
            System.out.println("Update success!");
        }else{
            System.out.println("Update failed!");
        }
    }
    
    public void read(Employee readingEmployee){
        if(employeeModel.read(readingEmployee) != null){
            System.out.println(readingEmployee.toString());
        }else{
            System.out.println("Read failed!");
        }
    }
    
    public void delete(Employee deletingEmployee){
        if(employeeModel.delete(deletingEmployee)){
            System.out.println("Delete success!");
        }else{
            System.out.println("Delete failed!");
        }
    }
    
}
