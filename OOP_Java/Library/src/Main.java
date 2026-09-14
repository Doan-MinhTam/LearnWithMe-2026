public class Main {
    public static void main(String[] args) {
        Library library = new Library("City Central Library", 6);

        System.out.println(">>> ĐANG TEST HÀM: addBook() <<<");
        library.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954));
        library.addBook(new Book("Pride and Prejudice", "Jane Austen", 1813));
        library.addBook(new Book("1984", "George Orwell", 1949));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
        library.addBook(new Book("Moby Dick", "Herman Melville", 1851));

        System.out.println(">>> ĐANG TEST HÀM: displayBooks() <<<");
        library.displayBooks();

        System.out.println(">>> ĐANG TEST HÀM: findBookByTitle() <<<");
        library.findBookByTitle("1984");
    }
}