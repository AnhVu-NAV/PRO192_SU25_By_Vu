/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author AnhVuNAV
 */
public class Customer extends User{
    private double point;

    public Customer() {
    }

    public Customer(String id, String name, String password, String address, double point) {
        super(id, name, password, address);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Customer[" + "id=" + super.getId() + ", name=" + super.getName() 
                + ", password=" + super.getPassword() + ", address=" + super.getAddress() 
                + "point=" + point + ']';
    }
    
    
    
}
