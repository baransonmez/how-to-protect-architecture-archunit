package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.output.adapters;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports.BookPort;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.Book;

public class BookAdapter implements BookPort {
    @Override
    public void saveBook(Book book) {

    }
}
