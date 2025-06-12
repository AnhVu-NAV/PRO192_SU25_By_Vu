/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author AnhVuNAV
 */
public class Employee extends User {

    private boolean isAdmin;

    public Employee() {
    }

    public Employee(String id, String name, String password, String address, boolean isAdmin) {
        super(id, name, password, address);
        this.isAdmin = isAdmin;
    }

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "Employee[" + "id=" + super.getId() + ", name=" + super.getName() 
                + ", password=" + super.getPassword() + ", address=" + super.getAddress() 
                + "isAdmin=" + isAdmin + ']';
    }
    
    

}
