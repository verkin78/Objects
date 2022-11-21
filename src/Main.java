public class Main {
    public static void main(String[] args) {
        Auther auther1 = new Auther("Michael", "Ivanov");
        Book book1 = new Book("December", auther1, "2003");
        Auther auther2 = new Auther("Lincy", "Smith");
        Book book2 = new Book("Weather at Home", auther2, "1794");
        book1.setCreateYear("2001");
        System.out.println(" Название книги: " + book1.getBookName() + ". Автор: " + auther1.getName() + " "
                + auther1.getLastName() + ". Год публикации: " + book1.getCreateYear() + ".");
        System.out.println(" Название книги: " + book2.getBookName() + ". Автор: " + auther2.getName() + " "
                + auther2.getLastName() + ". Год публикации: " + book2.getCreateYear() + ".");
    }

}