/**
 * Service quản lý thư viện - tuân thủ Single Responsibility Principle
 */
class LibraryService {
    private java.util.List<Book> books;
    private java.util.List<LibraryMember> members;
    
    public LibraryService() {
        this.books = new java.util.ArrayList<>();
        this.members = new java.util.ArrayList<>();
    }
    
    public void addBook(Book book) throws InvalidMemberException {
        if (!book.isValid()) {
            throw new InvalidMemberException("Invalid book data");
        }
        books.add(book);
    }
    
    public void addMember(LibraryMember member) throws InvalidMemberException {
        if (!member.isValid()) {
            throw new InvalidMemberException("Invalid member data");
        }
        members.add(member);
    }
    
    public Book findBookByIsbn(String isbn) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        throw new BookNotFoundException("Book with ISBN '" + isbn + "' not found");
    }
    
    public LibraryMember findMemberById(String memberId) throws InvalidMemberException {
        for (LibraryMember member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        throw new InvalidMemberException("Member with ID '" + memberId + "' not found");
    }
    
    public void borrowBook(String isbn, String memberId) throws BookNotFoundException, 
            BookAlreadyBorrowedException, InvalidMemberException {
        Book book = findBookByIsbn(isbn);
        LibraryMember member = findMemberById(memberId);
        
        if (!member.canBorrowMore()) {
            throw new InvalidMemberException("Member has reached borrow limit");
        }
        
        book.borrow(memberId);
        member.incrementBorrowCount();
    }
    
    public void returnBook(String isbn) throws BookNotFoundException {
        Book book = findBookByIsbn(isbn);
        
        if (!book.isBorrowed()) {
            System.out.println("Book is not currently borrowed");
            return;
        }
        
        try {
            LibraryMember member = findMemberById(book.getBorrowedBy());
            member.decrementBorrowCount();
        } catch (InvalidMemberException e) {
            System.out.println("Warning: " + e.getMessage());
        }
        
        book.returnItem();
    }
    
    public java.util.List<Book> getAllBooks() {
        return new java.util.ArrayList<>(books);
    }
    
    public java.util.List<LibraryMember> getAllMembers() {
        return new java.util.ArrayList<>(members);
    }
}
