//Edu/lis/24/128
// Bala Ediwa Ido 
//Library and information science

//LAB 6
//Task 6.7 (challenge). Create a Book class (title, author, ISBN, availability) and a Library class that holds an array of books and has methods borrow(isbn) and giveBack(isbn).

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Available: " + available + "]";
    }
}
public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    public void borrow(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (books[i].isAvailable()) {
                    books[i].setAvailable(false);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Book is already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void giveBack(String isbn) {
        for (int i = 0; i < count; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (!books[i].isAvailable()) {
                    books[i].setAvailable(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
public class TestLibrary {
    public static void main(String[] args) {
        Library lib = new Library(5);
        lib.addBook(new Book("Things Fall Apart", "Chinua Achebe", "111"));
        lib.addBook(new Book("Purple Hibiscus", "Chimamanda Adichie", "222"));
        lib.addBook(new Book("Java Basics", "John Doe", "333"));

        lib.listBooks();

        lib.borrow("111");
        lib.borrow("111");
        lib.giveBack("111");
        lib.borrow("999");

        lib.listBooks();
    }
}