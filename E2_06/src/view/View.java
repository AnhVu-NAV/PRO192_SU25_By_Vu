/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controllers.CustomerController;
import controllers.EmployeeController;
import entities.Customer;
import entities.Employee;

/**
 *
 * @author AnhVuNAV
 */
public class View {
    public static void main(String[] args) {
        // Kiểm thử EmployeeController
        System.out.println("=== EMPLOYEE CONTROLLER TEST ===");
        EmployeeController employeeController = new EmployeeController();

        Employee e1 = new Employee();
        e1.setId("E001");
        e1.setName("Nguyen Van A");
        e1.setPassword("123456");
        e1.setAddress("Hanoi");
        e1.setIsAdmin(true);

        Employee e2 = new Employee();
        e2.setId("E002");
        e2.setName("Tran Thi B");
        e2.setPassword("abcdef");
        e2.setAddress("Saigon");
        e2.setIsAdmin(false);

        // Create
        employeeController.create(e1); // Expected: Create success!
        employeeController.create(e2); // Expected: Create success!
        employeeController.create(e1); // Expected: Create failed! (trùng ID)

        // Read
        employeeController.read(e1);  // Expected: thông tin e1
        Employee eFake = new Employee();
        eFake.setId("E999");
        employeeController.read(eFake);  // Expected: Read failed!

        // Update
        e1.setName("Nguyen Van A - Updated");
        employeeController.update(e1); // Expected: Update success!
        employeeController.read(e1);  // Kiểm tra lại

        // Delete
        employeeController.delete(e1); // Expected: Delete success!
        employeeController.delete(e1); // Expected: Delete failed! (đã xóa rồi)

        System.out.println("\n=== CUSTOMER CONTROLLER TEST ===");
        // Kiểm thử CustomerController
        CustomerController customerController = new CustomerController();

        Customer c1 = new Customer();
        c1.setId("C001");
        c1.setName("Le Thi C");
        c1.setPassword("pass1");
        c1.setAddress("Hue");
        c1.setPoint(100.5);

        Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName("Pham Van D");
        c2.setPassword("pass2");
        c2.setAddress("Danang");
        c2.setPoint(200.0);

        // Create
        customerController.create(c1); // Expected: Create success!
        customerController.create(c2); // Expected: Create success!
        customerController.create(c1); // Expected: Create failed!

        // Read
        customerController.read(c1);  // Expected: thông tin c1

        // Update
        c2.setPoint(300.0);
        customerController.update(c2); // Expected: Update success!
        customerController.read(c2);   // Kiểm tra lại

        // Delete
        customerController.delete(c2); // Expected: Delete success!
        customerController.delete(c2); // Expected: Delete failed!
    }
}
