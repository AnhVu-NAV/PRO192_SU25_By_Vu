/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class Cat extends Animal{

    public Cat() {
        super("Méo", "Mimi");
    }

    public Cat(String type, String name) {
        super(type, name);
    }

    @Override
    public void eats() {
        System.out.println("Pate");
    }

    @Override
    public void sounds() {
        System.out.println("Meo Meo");
    }
    
}
