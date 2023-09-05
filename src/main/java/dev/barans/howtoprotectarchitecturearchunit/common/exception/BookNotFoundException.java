package dev.barans.howtoprotectarchitecturearchunit.common.exception;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

    public BookNotFoundException(Throwable err) {
        super(err);
    }

    public BookNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
