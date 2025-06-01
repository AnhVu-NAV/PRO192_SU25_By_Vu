/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import controllers.BookController;
import entities.Book;

/**
 *
 * @author AnhVuNAV
 */
public class Main {
    public static void main(String[] args) {
        BookController bookController = new BookController();

        Book book1 = new Book();
        book1.setId("001");
        book1.setName("Name 1");
        book1.setAuthor("Author 1");
        book1.setPublicationDate("01/01/2002");
        book1.setPrice(350000);
        book1.setDiscount(0.35);
        book1.setQuantity(10);
        bookController.create(book1);

        Book book2 = new Book();
        book2.setId("002");
        book2.setName("Name 2");
        book2.setAuthor("Author 2");
        book2.setPublicationDate("02/01/2002");
        book2.setPrice(200000);
        book2.setDiscount(0.15);
        book2.setQuantity(10);
        bookController.create(book2);

        Book book3 = new Book();
        book3.setId("003");
        book3.setName("Name 3");
        book3.setAuthor("Author 3");
        book3.setPublicationDate("03/01/2002");
        book3.setPrice(430000);
        book3.setDiscount(0.25);
        book3.setQuantity(10);
        bookController.create(book3);

        Book book4 = new Book();
        book4.setId("002");
        book4.setName("Name 4");
        book4.setAuthor("Author 4");
        book4.setPublicationDate("04/01/2002");
        book4.setPrice(550000);
        book4.setDiscount(0.15);
        book4.setQuantity(10);
        bookController.create(book4);

        System.out.println();
        bookController.showAll();
        System.out.println();

        Book book5 = new Book();
        book5.setId("002");
        book5.setName("Doraemon");
        book5.setAuthor("Mr. Thanh");
        book5.setPublicationDate("04/01/2002");
        book5.setPrice(980000);
        book5.setDiscount(0.25);
        book5.setQuantity(30);
        bookController.update(book5);

        bookController.showAll();
        System.out.println();

        Book book6 = new Book();
        book6.setId("002");
        bookController.read(book6);
        System.out.println();

        Book book7 = new Book();
        book7.setId("003");
        bookController.delete(book7);

        bookController.showAll();
    }
}
