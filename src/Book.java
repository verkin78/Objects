public class Book {
    String bookName;
    String bookAuther;
    String createYear;

    public Book(String bookName, String bookAuther, String createYear) {
        this.bookName = bookName;
        this.bookAuther = bookAuther;
        this.createYear = createYear;
    }
            public String getBookName() {
        return bookName;
    }
    public String getBookAuther() {
        return bookAuther;
    }
    public String getCreateYear() {
        return createYear;
    }
    public void setCreateYear() {
        this.createYear = createYear;
    }
}
