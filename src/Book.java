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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Book book = (Book) object;
        return bookName.equals(book.bookName) && bookAuther.equals(book.bookAuther) && createYear.equals(book.createYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, bookAuther, createYear);
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ". Имя автора: " + bookAuther + ", год издани: " + createYear;}
    }