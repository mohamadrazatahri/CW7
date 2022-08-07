package entity;

import java.util.List;
import java.util.Objects;

public class Library {
    private List<UserAccount> userAccounts;
    private List<Books> booksList;
    private double allDeposite;

    public Library() {
    }

    public Library(List<UserAccount> userAccounts, List<Books> booksList, double allDeposite) {
        this.userAccounts = userAccounts;
        this.booksList = booksList;
        this.allDeposite = allDeposite;
    }

    public List<UserAccount> getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(List<UserAccount> userAccounts) {
        this.userAccounts = userAccounts;
    }

    public List<Books> getBooksList() {
        return booksList;
    }

    public void setBooksList(List<Books> booksList) {
        this.booksList = booksList;
    }

    public double getAllDeposite() {
        return allDeposite;
    }

    public void setAllDeposite(double allDeposite) {
        this.allDeposite = allDeposite;
    }

    @Override
    public String toString() {
        return "Library{" +
                "userAccounts=" + userAccounts +
                ", booksList=" + booksList +
                ", allDeposite=" + allDeposite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Double.compare(library.allDeposite, allDeposite) == 0 && Objects.equals(userAccounts, library.userAccounts) && Objects.equals(booksList, library.booksList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userAccounts, booksList, allDeposite);
    }
}
