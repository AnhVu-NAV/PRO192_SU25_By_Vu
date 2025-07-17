public class Book implements IBook {
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

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    @Override
    public String entry() {
        return String.format("(%s) is added", title);
    }

    @Override
    public String print() {
        return String.format("(%s, %s, %d): [%s]", title, author, yop, bookCategory.getName());
    }
}
