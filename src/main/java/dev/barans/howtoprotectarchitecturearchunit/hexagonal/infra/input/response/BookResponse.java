package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.response;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.BookType;

import java.io.Serializable;
import java.util.Objects;

public class BookResponse implements Serializable {
    private static final long serialVersionUID = 1L;
    private final String bookName;
    private final BookType type;

    public BookResponse(String bookName,
                        BookType type) {
        this.bookName = bookName;
        this.type = type;
    }

    public static BookResponse from(Book book) {
        return new BookResponse(book.getName(), book.getType());
    }

    public String bookName() {
        return bookName;
    }

    public BookType type() {
        return type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (BookResponse) obj;
        return Objects.equals(this.bookName, that.bookName) &&
                Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, type);
    }

    @Override
    public String toString() {
        return "BookResponse[" +
                "bookName=" + bookName + ", " +
                "type=" + type + ']';
    }

}
