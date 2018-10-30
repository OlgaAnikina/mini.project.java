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

    public Book(String name, Set<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Set<Author> authors, double price, int qty) {
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

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public String getAuthorName() {
       Iterator<Author> author = authors.iterator();
       String result = "Authors : ";
       while(author.hasNext()) {
           result += author.next().toStringOnlyName() + ", ";
       }
       return result;
    }
    public  String getAuthorsToString() {
        Iterator<Author> author = authors.iterator();
        String result = "Authors : ";
        while(author.hasNext()) {
            result += author.next().toString() + ",  ";
        }
        return result;
    }

    public String toString() {
        return " Book [ Name = " + getName() + " , Authors = { " +  getAuthorsToString()
                + " }, Price = " + getPrice() + ", qty = " + getQty() + " ].";
    }
    public int getCountAuthors() {
        return authors.size();
    }

}
