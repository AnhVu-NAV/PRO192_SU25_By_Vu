/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Customer;
import java.util.ArrayList;

/**
 *
 * @author AnhVuNAV
 */
public class CustomerModel {

    private ArrayList<Customer> customerList;

    public CustomerModel() {
        customerList = new ArrayList<Customer>();
    }

    public CustomerModel(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public boolean create(Customer creatingCustomer) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(creatingCustomer.getId())) {
                return false;
            }
        }
        customerList.add(creatingCustomer);
        return true;

    }

    public boolean update(Customer updatingCustomer) {
        int index = customerList.indexOf(updatingCustomer);
        if (index < 0) {
            customerList.set(index, updatingCustomer);
            return true;
        }
        return false;
    }

    public Customer read(Customer readingCustomer) {
        for (Customer customer : customerList) {
            if (customer.getId().equals(readingCustomer.getId())) {
                return customer;
            }
        }
        return null;
    }

    public boolean delete(Customer deletingCustomer) {
        return customerList.removeIf(c -> c.getId().equals(deletingCustomer.getId()));
    }

}
