package anikina.olga.tasks.java.main.firstTask;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(final String name, final String email, final char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return " Author's name = " + name + ", email : "
                + email + ",  gender : " + gender + ". ";
    }

    public String toStringOnlyName() {
        return name;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 17 * result + name.hashCode();
        result = 17 * result + email.hashCode();
        result = 17 * result + (int) gender;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return (author.getName().equals(name))
                && (author.getEmail().equals(email)) && (author.getGender() == gender);
    }

}
