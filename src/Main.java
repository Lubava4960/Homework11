public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Ivan", "Turgenev");
        Author author2 = new Author("Lev", "Tolstoy");
        Book book1 = new Book("Novy", author1, 1876);
        Book book2 = new Book("Voyna i mir", author2, 1867);
        Book book3 = new Book("Ozma of Oz", new Author("L.Frank", "Baum"), 1907);
        //System.out.println(book1);
        //System.out.println(book2);
        //System.out.println(book3);
        Book[] library = new Book[3];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        for (Book book : library) {
            System.out.println(book);

        }

    }
}