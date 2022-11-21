public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("December", "Ivanov", "2003");
        Auther auther1 = new Auther("Michael", "Ivanov");
        Book book2 = new Book("Weather at Home", "Smith", "1794");
        Auther auther2 = new Auther("Lincy", "Smith");
        System.out.println(" Название книги: " + book1.getBookName() + ". Автор: " + book1.getBookAuther()
                + ". Год публикации: " + book1.getCreateYear() + ".");
        System.out.println(" Автор книги: " + auther1.getName() + " " + auther1.getLastName() + ".");
        System.out.println(" Название книги: " + book2.getBookName() + ". Автор: " + book2.getBookAuther()
                + ". Год публикации: " + book2.getCreateYear() + ".");
        System.out.println(" Автор книги: " + auther2.getName() + " " + auther2.getLastName() + ".");
    }

}