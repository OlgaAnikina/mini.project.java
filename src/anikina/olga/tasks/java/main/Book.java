package anikina.olga.tasks.java.main;

import anikina.olga.tasks.java.main.Author;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Book {
    private String name;
    private Set<Author> authors = new HashSet<>();
    private double price;
    private int qty;

    public Book(final String name, Set<Author> authors, final double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(final String name, Set<Author> authors, final double price, final int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public void setAuthors(final Set<Author> authors) {
        this.authors = authors;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public void setQty(final int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        Iterator<Author> author = authors.iterator();
        String result = "Authors : ";
        while (author.hasNext()) {
            result += author.next().toStringOnlyName() + ", ";
        }
        return result;
    }

    public String getAuthorsToString() {
        Iterator<Author> author = authors.iterator();
        String result = "Authors : ";
        while (author.hasNext()) {
            result += author.next().toString() + ",  ";
        }
        return result;
    }

    public String toString() {
        return " Book [ Name = " + getName() + " , Authors = { " + getAuthorsToString()
                + " }, Price = " + getPrice() + ", qty = " + getQty() + " ].";
    }

    public int getCountAuthors() {
        return authors.size();
    }

    private boolean compareAuthors(Set<Author> authors) {
        Iterator<Author> i1 = this.authors.iterator(), i2 = authors.iterator();
        while (i1.hasNext() && i2.hasNext()) {
            if (!i1.next().equals(i2.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = 31;
        result = 17 * result + qty;
        result = 17 * result + (int) price;
        result = 17 * result + name.hashCode();
        Iterator<Author> iterator = authors.iterator();
        while (iterator.hasNext()) {
            result = 17 * result + iterator.next().hashCode();
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return (book.getName().equals(name) && (book.getPrice() == price)
                && book.getQty() == qty && compareAuthors(book.getAuthors()));
    }


}
