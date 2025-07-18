/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author AnhVuNAV
 */
public class BookCategory implements IBook{
    private String id;
    private String name;

    public BookCategory() {
    }

    public BookCategory(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String entry() {
        return "(" + id + "," + name +") is added";
    }

    @Override
    public String print() {
        return "(" + id + "," + name +")";
    }
    
    
}
