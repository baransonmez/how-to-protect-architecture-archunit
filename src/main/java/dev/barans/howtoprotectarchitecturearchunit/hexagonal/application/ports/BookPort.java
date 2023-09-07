package dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;

public interface BookPort {

    Book find(Long id);
    void saveBook(Book book);
}
