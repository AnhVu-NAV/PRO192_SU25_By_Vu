/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import entities.Book;
import java.util.*;

/**
 *
 * @author AnhVuNAV
 */
public class BookModel {
    private ArrayList<Book>bookList;

    public BookModel() {
        bookList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }
    
    public boolean create(Book creatingBook){
        for(Book book: bookList){
            if(book.getId().equals(creatingBook.getId())){
                return false;
            }
        }
        bookList.add(creatingBook);
        return true;
    }
    
    public boolean update(Book updatingBook){
        for(Book book: bookList){
            if(book.getId().equals(updatingBook.getId())){
                bookList.set(bookList.indexOf(book), updatingBook);
//                book.setAuthor(updatingBook.getAuthor());
//                book.setDiscount(updatingBook.getDiscount());
                return true;
            }
        }
        return false;
    }
    
    public Book read(Book readingBook){
        for(Book book: bookList){
            if(book.getId().equals(readingBook.getId())){
                return book;
            }
        }
        return null;
    }
    
    public boolean delete(Book deletingBook){
        for(Book book: bookList){
            if(book.getId().equals(deletingBook.getId())){
                bookList.remove(book);
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<Book> showAll(){
        return bookList;
    }
}
