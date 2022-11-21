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
}
