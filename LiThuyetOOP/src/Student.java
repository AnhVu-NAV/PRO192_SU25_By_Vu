/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Student extends Person{
    // tinh ke thua: phuong phap cho phép lớp con sử dung lại những 
//    trường dữ liệu hay phương của lớp cha
    // inheritance
    
    
//    để kế thừa sẽ sử dụng: extends
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, double gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override //ghi de phuong thuc
    public String toString() {
        return "Student{" + "id=" + super.getId() + ", name=" + super.getName() + ", age=" + super.getAge() + ", gpa=" + this.gpa + '}';
    }
    
    
}
