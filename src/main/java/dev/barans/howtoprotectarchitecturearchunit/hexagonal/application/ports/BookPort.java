package dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;

public interface BookPort {
    void saveBook(Book book);
}
