/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q1;

/**
 *
 * @author AnhVuNAV
 */
public class Book implements IBook{
    private String title;
    private String author;
    private int yop;
    private BookCategory bookCategory;

    public Book() {
    }

    public Book(String title, String author, int yop, BookCategory bookCategory) {
        this.title = title;
        this.author = author;
        this.yop = yop;
        this.bookCategory = bookCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    @Override
    public String entry() {
        return "(" + title + ") is added";
    }

    @Override
    public String print() {
        return "(" + title + "," + author + "," + yop 
                + "):[" + bookCategory.getName() + "]";
    }
    
    
    
}
