public class Library {
    private final String name;
    private final Book[] books;
    private int bookCount;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book){

    }

    public void displayBooks(){
        System.out.println("\n---Books in " + this.name + " ---");

    }

    public Book findBookByTitle(){


        return null;
    }
}
