public class Book {
    String bookName;
    String augther;
    int createYear;

    public Book(String bookName, String augther, int createYear) {
        this.bookName = bookName;
        this.augther = augther;
        this.createYear = createYear;
    }
            public String getBookName() {
        return bookName;
    }
    public String getAugther() {
        return augther;
    }
    public int getCreateYear() {
        return createYear;
    }
    public void setCreateYear() {
        this.createYear = createYear;
    }
}
