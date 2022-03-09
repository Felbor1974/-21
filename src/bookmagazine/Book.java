package bookmagazine;

import java.util.Objects;

public class Book {
    String nameBook = "";
    int yearPublication = 0;
    int priceBook = 0;

    public Book() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && priceBook == book.priceBook && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearPublication, priceBook);
    }

    @Override
    public String toString() {
        return
                "nameBook='" + nameBook + '\'' +
                        ", yearPublication=" + yearPublication +
                        ", priceBook=" + priceBook +
                        '}';
    }
}
