/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    //Change the name of input and output file based on practical paper
    String inputFile = "input.txt";
    String outputFile = "output.txt";

    //--VARIABLES - @STUDENT: DECLARE YOUR VARIABLES HERE:
    private ArrayList<BookCategory> bookCategories;
    private ArrayList<Book> books;
    private ArrayList<String> output;

    public Q1() {
        bookCategories = new ArrayList<>();
        books = new ArrayList<>();
        output = new ArrayList<>();
    }

    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    String fi, fo;

    /**
     * Set input and output file for automatic rating
     *
     * @param args path of input file and path of output file
     */
    public void setFile(String[] args) {
        fi = args.length >= 2 ? args[0] : inputFile;
        fo = args.length >= 2 ? args[1] : outputFile;
    }

    /**
     * Reads data from input file
     */
    public void read() {
        try (Scanner sc = new Scanner(new File(fi))) {
            //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            int t = Integer.parseInt(sc.nextLine());
            for (int i = 0; i < t; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String select = parts[0];

                switch (select) {
                    case "AddBookCategory":
                        BookCategory newCategory = new BookCategory(parts[1], parts[2]);
                        bookCategories.add(newCategory);
                        output.add(newCategory.entry());
                        break;
                    case "PrintBookCategory":
                        output.add("---" + select + "---");
                        if (bookCategories.isEmpty()) {
                            output.add("Empty");
                        } else {
                            for (BookCategory bc : bookCategories) {
                                output.add(bc.print());
                            }
                        }
                        output.add("---");
                        break;
                    case "AddBook":
                        String title = parts[1];
                        String author = parts[2];
                        int yop = Integer.parseInt(parts[3]);
                        String catergoryId = parts[4];

                        BookCategory findCategory = null;
                        for (BookCategory bc : bookCategories) {
                            if(bc.getId().equals(catergoryId)){
                                findCategory = bc;
                                break;
                            }
                        }
                        
                        if(findCategory != null){
                            Book newBook = new Book(title, author, yop, findCategory);
                            books.add(newBook);
                            output.add(newBook.entry());
                        }
                        break;
                    case "PrintBook":
                        output.add("---" + select + "---");
                        if (books.isEmpty()) {
                            output.add("Empty");
                        } else {
                            for (Book b : books) {
                                output.add(b.print());
                            }
                        }
                        output.add("---");
                        break;
                    case "SearchBook":
                        output.add("---" + select + "---");
                        String searchTitle = parts[1];
                        boolean flag = false;
                        for(Book b: books){
                            if(b.getTitle().equals(searchTitle)){
                                output.add(b.print());
                                flag = true;
                            }
                        }
                        if(flag == false){
                            output.add("Not Found");
                        }
                        output.add("---");
                        break;
                    case "ClearBook":
                        output.add("---" + select + "---");
                        books.clear();
                        output.add("* Remove all book");
                        output.add("---");
                        break;
                    default:
                        throw new AssertionError();
                }

            }
            //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
            //--START FIXED PART--------------------------    
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------

    //ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):
    //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
    //--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve() {
        //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
        //--START FIXED PART-------------------------- 
    }

    /**
     * Write result into output file
     */
    public void printResult() {
        try {
            FileWriter fw = new FileWriter(fo);
            //--END FIXED PART----------------------------

            //OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
            for(String line: output){
                fw.write(line + "\n");
            }
            

            //--FIXED PART - DO NOT EDIT ANY THINGS HERE--
            //--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Output Exception # " + ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Q1 q = new Q1();
        q.setFile(args);
        q.read();
        q.solve();
        q.printResult();
    }
    //--END FIXED PART----------------------------    
}
