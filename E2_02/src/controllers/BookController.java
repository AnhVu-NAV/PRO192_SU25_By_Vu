/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import entities.Book;
import java.util.ArrayList;
import models.BookModel;

/**
 *
 * @author AnhVuNAV
 */
public class BookController {
    private BookModel bookModel;

    public BookController() {
        bookModel = new BookModel();
    }

    public BookModel getBookModel() {
        return bookModel;
    }

    public void setBookModel(BookModel bookModel) {
        this.bookModel = bookModel;
    }
    
    public void create(Book creatingBook){
        if(bookModel.create(creatingBook)){
            System.out.println("Create success!");
        }else{
            System.out.println("Create failed!");
        }
    }
    
    public void update(Book updatingBook){
        if(bookModel.update(updatingBook)){
            System.out.println("Update success!");
        }else{
            System.out.println("Update failed!");
        }
    }
    
    public void read(Book readingBook){
        if(bookModel.read(readingBook) != null){
            System.out.println(bookModel.read(readingBook).toString());
        }else{
            System.out.println("Read failed!");
        }
    }
    
    public void delete(Book deletingBook){
        if(bookModel.delete(deletingBook)){
            System.out.println("Delete success!");
        }else{
            System.out.println("Delete failed!");
        }
    }
    
    public void showAll(){
        ArrayList<Book> list = bookModel.showAll();
        for(Book book: list){
            System.out.println(book.toString());
        }
    }
}
