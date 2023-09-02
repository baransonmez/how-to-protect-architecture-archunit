package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input;

import dev.barans.howtoprotectarchitecturearchunit.hexagonal.application.service.BookApplicationService;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.request.CreateBookRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    BookApplicationService applicationService;

    @GetMapping("/create")
    public void createBook(CreateBookRequest request) {
        applicationService.createBook(request.bookName(), request.type());
    }
}
