import java.util.Objects;

public class Author {
    private String name;
    private String LastName;

    public Author(String name,String LastName) {
        this.name = name;
        this.LastName = LastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "Author:" + name+ " " + LastName;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(LastName, author.LastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, LastName);
    }
}
