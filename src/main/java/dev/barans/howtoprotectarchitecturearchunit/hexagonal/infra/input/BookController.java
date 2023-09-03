package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.service.BookApplicationService;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.Book;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.request.CreateBookRequest;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.response.BookResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    BookApplicationService applicationService;

    @GetMapping("/create")
    @PreAuthorize(value = "ADMIN")
    public ResponseEntity<BookResponse> createBook(CreateBookRequest request) {
        Book book = applicationService.createBook(request.bookName(), request.type());
        return ResponseEntity.ok(BookResponse.from(book));
    }
}
