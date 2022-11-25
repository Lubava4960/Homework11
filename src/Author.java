public class Author {
    String nameAuthor;
    String surnameAuthor;
    public static Author Author(String nameAuthor, String surnameAuthor) {
        Author author = new Author();
        author.nameAuthor = nameAuthor;
        author.surnameAuthor = surnameAuthor;
        return author;
    }

}
