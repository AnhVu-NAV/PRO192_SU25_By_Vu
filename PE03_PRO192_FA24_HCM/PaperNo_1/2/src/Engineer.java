/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Engineer extends Staff{
    private int benefits;

    public Engineer() {
    }

    public Engineer(int id, int salary, int benefits) {
        super(id, salary);
        this.benefits = benefits;
    }

    public int getBenefits() {
        return benefits;
    }

    public void setBenefits(int benefits) {
        this.benefits = benefits;
    }
    
    public int getGrossSalary(){
        return super.getSalary() + this.benefits;
    }

    @Override
    public String toString() {
        return "" + super.getId() + ", " + super.getSalary() + ", " + benefits + ", " + getGrossSalary();
    }
    
    
}
