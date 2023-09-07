package dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.service;

import dev.barans.howtoprotectarchitecturearchunit.common.util.BookHelper;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.ports.BookPort;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.BookType;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.service.BookDomainService;

public class BookApplicationService {
    BookPort port;
    BookDomainService domainService;

    public Book createBook(String name, BookType type) {
        Book book = domainService.createBook(name, type);
        port.saveBook(book);
        return book;
    }

    public String getBookName(Long id) {
        Book book = port.find(id);

        return BookHelper.formatBookName(book);
    }
}
