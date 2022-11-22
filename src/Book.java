import java.util.Objects;

public class Book {
    private String bookName;
    private Auther bookAuther;
    private String createYear;

    public Book(String bookName, Auther bookAuther, String createYear) {
        this.bookName = bookName;
        this.bookAuther = bookAuther;
        this.createYear = createYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Auther getBookAuther() {
        return bookAuther;
    }

    public String getCreateYear() {
        return createYear;
    }

    public void setCreateYear() {
        this.createYear = createYear;
    }

    @Override
    private boolean equals(Object 0) {
        if (this == 0) return true;
        if (0 == null || getClass() != 0. getClass())return fales;
        Book book = (Book) 0;
        return bookName.equals(Book.bookName) && bookAuther.equals(Book.bookAuther) && createYear.equals(Book.createYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuther, createYear);
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ". Имя автора: " + bookAuther + ", год издани: " + createYear;}
    }