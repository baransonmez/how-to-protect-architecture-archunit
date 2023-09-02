package dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.service;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.BookType;

public class BookDomainService {

    public Book createBook(String name, BookType type) {
        Book book = new Book(name, type);
        return book;

    }
}
