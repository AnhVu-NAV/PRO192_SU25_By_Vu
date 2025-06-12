/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Employee;
import java.util.ArrayList;

/**
 *
 * @author AnhVuNAV
 */
public class EmployeeModel {
    private ArrayList<Employee> employeeList;

    public EmployeeModel() {
        employeeList = new ArrayList<Employee>();
    }

    public EmployeeModel(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public boolean create(Employee creatingEmployee){
        for(Employee e: employeeList){
            if(e.getId().equals(creatingEmployee.getId())){
                return false;
            }
        }
        employeeList.add(creatingEmployee);
        return true;
    }
    
    public boolean update(Employee updatingEmployee){
        for (Employee e: employeeList) {
            if(e.getId().equals(updatingEmployee.getId())){
                employeeList.set(employeeList.indexOf(e), updatingEmployee);
//                employeeList.get(employeeList.indexOf(e)).setName(updatingEmployee.getName());
//                employeeList.get(employeeList.indexOf(e)).setAddress(updatingEmployee.getAddress());
//                employeeList.get(employeeList.indexOf(e)).setPassword(updatingEmployee.getPassword());
//                employeeList.get(employeeList.indexOf(e)).setIsAdmin(updatingEmployee.isIsAdmin());
                return true;
            }
        }
        return false;
    }
    
    public Employee read(Employee readingEmployee){
        for(Employee e: employeeList){
            if(e.getId().equals(readingEmployee.getId())){
                return e;
            }
        }
        return null;
    }
    
    public boolean delete(Employee deletingEmployee){
       for(Employee e: employeeList){
            if(e.getId().equals(deletingEmployee.getId())){
                employeeList.remove(e);
                return true;
            }
        } 
       return false;
    }
}
