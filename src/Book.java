public class Book {
   private String nameBook;
    private String avtor;
    private int yearPublishing = 1876;

    public Book(String nameBook, String avtor, int yearPublishing) {
        this.nameBook = nameBook;
        this.avtor = avtor;
        this.yearPublishing = yearPublishing;

    }

    public String getNameBook() {
        return this.nameBook;
    }
    public String getAvtor() {
        return this.avtor;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing){
        this.yearPublishing = yearPublishing;

    }


}