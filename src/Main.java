public class Main {
    public static void main(String[] args) {
        String nameBook = "Novy";
        String avtor = "Ivan Turgenev";
        int yearPublishing = 1876;
        Book book = new Book("Novy", "Ivan Turgenev", 1876);
        System.out.println("book.nameBook = " + book.getNameBook());
        System.out.println("book.avtor = " + book.getAvtor());
        System.out.println("book.yearPublishing = " + book.getYearPublishing());
        book.setYearPublishing(1877);
        System.out.println("book.getAvtor() = " + book.getAvtor());
        System.out.println(+book.getYearPublishing());

        Book book2 = new Book("Oz country", "L.Frank Baum", 1910);
        System.out.println("book2.nameBook = " + book2.getNameBook());
        //Автор//
        System.out.println("Задание Автор");
        Author turgenev = new Author("Ivan ", "Turgenev ") ;
        System.out.println("turgenev.nameAuthor = " + turgenev.getNameAuthor());
        System.out.println("turgenev.surnameAuthor = " + turgenev.getSurnameAuthor());


    }
}

