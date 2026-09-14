public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;


    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author + " (" + publicationYear + ")";
    }
}
