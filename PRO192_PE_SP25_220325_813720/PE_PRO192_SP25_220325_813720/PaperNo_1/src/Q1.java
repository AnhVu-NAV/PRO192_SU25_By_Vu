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
     * @param args path of input file and path of output file
     */
    public void setFile (String[] args){
        fi = args.length>=2? args[0]: inputFile;
        fo = args.length>=2? args[1]: outputFile;
    }
    
    /**
     * Reads data from input file
     */
    public void read(){
        try (Scanner sc  = new Scanner(new File(fi))){
    //--END FIXED PART----------------------------

            //INPUT - @STUDENT: ADD YOUR CODE FOR INPUT HERE:
            int T = Integer.parseInt(sc.nextLine());
            for(int i = 0; i < T; i++) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String command = parts[0];
                
                switch(command) {
                    case "AddBookCategory":
                        BookCategory category = new BookCategory(parts[1], parts[2]);
                        bookCategories.add(category);
                        output.add(category.entry());
                        break;
                    case "PrintBookCategory":
                        if(bookCategories.isEmpty()) {
                            output.add("Empty");
                        } else {
                            for(BookCategory bc : bookCategories) {
                                output.add(bc.print());
                            }
                        }
                        break;
                    case "AddBook":
                        String title = parts[1];
                        String author = parts[2];
                        int yop = Integer.parseInt(parts[3]);
                        String categoryId = parts[4];
                        
                        BookCategory foundCategory = null;
                        for(BookCategory bc : bookCategories) {
                            if(bc.getId().equals(categoryId)) {
                                foundCategory = bc;
                                break;
                            }
                        }
                        
                        if(foundCategory != null) {
                            Book book = new Book(title, author, yop, foundCategory);
                            books.add(book);
                            output.add(book.entry());
                        }
                        break;
                    case "PrintBook":
                        if(books.isEmpty()) {
                            output.add("Empty");
                        } else {
                            for(Book b : books) {
                                output.add(b.print());
                            }
                        }
                        break;
                    case "SearchBook":
                        String searchTitle = parts[1];
                        boolean found = false;
                        for(Book b : books) {
                            if(b.getTitle().equals(searchTitle)) {
                                output.add(b.print());
                                found = true;
                            }
                        }
                        if(!found) {
                            output.add("Not found");
                        }
                        break;
                }
            }

	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
            sc.close();
        }catch(FileNotFoundException ex){
            System.out.println("Input Exception # " + ex);
        }
    }
    //--END FIXED PART----------------------------
    
    //ALGORITHM - @STUDENT: ADD YOUROWN METHODS HERE (IF NEED):
    static class BookCategory {
        private String id;
        private String name;

        public BookCategory(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String entry() {
            return "BookCategory added: " + id + ", " + name;
        }

        public String print() {
            return id + ", " + name;
        }
    }

    static class Book {
        private String title;
        private String author;
        private int yearOfPublication;
        private BookCategory category;

        public Book(String title, String author, int yearOfPublication, BookCategory category) {
            this.title = title;
            this.author = author;
            this.yearOfPublication = yearOfPublication;
            this.category = category;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getYearOfPublication() {
            return yearOfPublication;
        }

        public BookCategory getCategory() {
            return category;
        }

        public String entry() {
            return "Book added: " + title + ", " + author + ", " + yearOfPublication + ", " + category.getId();
        }

        public String print() {
            return title + ", " + author + ", " + yearOfPublication + ", " + category.getId();
        }
    }

	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART--------------------------    
    /**
     * Main algorithm
     */
    public void solve(){
    //--END FIXED PART----------------------------

        //ALGORITHM - @STUDENT: ADD YOUR CODE HERE:
        // Nothing to do here as processing is done in read()

	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
    }
    
    /**
     * Write result into output file
     */
    public void printResult(){
	    try{
            FileWriter fw = new FileWriter(fo);
	//--END FIXED PART----------------------------
                
        	//OUTPUT - @STUDENT: ADD YOUR CODE FOR OUTPUT HERE:
            for(String line : output) {
                fw.write(line + "\n");
            }

	//--FIXED PART - DO NOT EDIT ANY THINGS HERE--
	//--START FIXED PART-------------------------- 
            fw.flush();
            fw.close();
        }catch (IOException ex){
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
