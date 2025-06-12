/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Customer;
import models.CustomerModel;

/**
 *
 * @author AnhVuNAV
 */
public class CustomerController {

    private CustomerModel customerModel;

    public CustomerController() {
        customerModel = new CustomerModel();
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public void create(Customer creatingCustomer) {
        if (customerModel.create(creatingCustomer)) {
            System.out.println("Create success!");
        } else {
            System.out.println("Create failed!");
        }
    }

    public void update(Customer updatingCustomer) {
        if (customerModel.update(updatingCustomer)) {
            System.out.println("Update success!");
        } else {
            System.out.println("Update failed!");
        }

    }

    public void read(Customer readingCustomer) {
        if (customerModel.read(readingCustomer) != null) {
            System.out.println(readingCustomer.toString());
        } else {
            System.out.println("Read failed!");
        }
    }

    public void delete(Customer deletingCustomer) {
        if (customerModel.delete(deletingCustomer)) {
            System.out.println("Delete success!");
        } else {
            System.out.println("Delete failed!");
        }
    }
}
