    public class Main {
    public static void main(String[] args) {
        Auther auther1 = new Auther("Michael", "Ivanov");
        Book book1 = new Book("December", auther1, "2003");
        Auther auther2 = new Auther("Lincy", "Smith");
        Book book2 = new Book("Weather at Home", auther2, "1794");

        System.out.println("Книга 1");
        System.out.println(book1);
        System.out.println("Книга 2");
        System.out.println(book2);
    }
}

