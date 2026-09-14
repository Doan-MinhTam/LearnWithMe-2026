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
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Added a book");
        } else {
            System.out.println("Library is full - Cannot add the book" + book.getTitle());
        }
    }

    public void displayBooks(){
        System.out.println("\n---Books in " + this.name + " ---");
        if (!(bookCount == 0)) {
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i].toString());
            }
        } else {
            System.out.println("The library is empty");
        }
    }

    public Book findBookByTitle(String title){
        System.out.println("Searching for: " + title);
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + books[i]);
                return books[i];
            }
        }
        System.out.println("Book not found.");
        return null;
    }
}
