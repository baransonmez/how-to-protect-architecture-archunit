package dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model;


import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.BookType;

public class Book {

    String name;
    BookType type;

    public Book(String name, BookType type) {
        this.name = name;
        this.type = type;
    }
}
