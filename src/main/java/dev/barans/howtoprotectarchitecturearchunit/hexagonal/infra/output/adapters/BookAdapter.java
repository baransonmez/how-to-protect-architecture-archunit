package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.output.adapters;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports.BookPort;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;

public class BookAdapter implements BookPort {

    public static final String BOOK_NAME_SALT = "saltsaltsaltsalt";

    @Override
    public void saveBook(Book book) {

    }
}
