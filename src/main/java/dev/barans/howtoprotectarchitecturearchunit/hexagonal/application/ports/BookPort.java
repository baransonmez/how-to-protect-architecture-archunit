package dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.Book;

public interface BookPort {
    void saveBook(Book book);
}
