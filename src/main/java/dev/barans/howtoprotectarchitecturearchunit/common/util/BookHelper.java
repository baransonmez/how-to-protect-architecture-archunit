package dev.barans.howtoprotectarchitecturearchunit.common.util;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;
@Deprecated
public class BookHelper {

    public static String formatBookName(Book book) {
        return book.getName() + "-" + book.getType();
    }
}
