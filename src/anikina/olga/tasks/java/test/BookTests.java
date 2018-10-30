package anikina.olga.tasks.java.test;

import anikina.olga.tasks.java.main.Author;
import anikina.olga.tasks.java.main.Book;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class BookTests {
    private static final double DELTA = 0.1;
    @Test
    public void isBooksConstructorRight() {

        Author author1 = new Author("Artur", "artur@mail.ru", 'm');
        Author author2 = new Author("Sam", "sam@mail.ru", 'm');
        Author author3 = new Author("Lizy", "lizy@mail.ru", 'f');
        Author author4 = new Author("Karl", "karl@mail.ru", 'm');
        Set<Author> authors = new HashSet<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        Book book  = new Book("Into the world", authors, 34.15);

        assertEquals(34.15, book.getPrice(), DELTA);
    }

    @Test
    public void isAutorsNameToStringRight() {

        Author author1 = new Author("Artur", "artur@mail.ru", 'm');
        Author author2 = new Author("Sam", "sam@mail.ru", 'm');
        Author author3 = new Author("Lizy", "lizy@mail.ru", 'f');
        Author author4 = new Author("Karl", "karl@mail.ru", 'm');
        Set<Author> authors = new HashSet<>();
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);
        authors.add(author4);
        Book book  = new Book("Into the world", authors, 34.15);

        assertEquals(4, book.getCountAuthors());
    }


}
