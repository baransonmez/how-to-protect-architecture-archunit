package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.request;

import dev.barans.howtoprotectarchitecturearchunit.common.RestInboundRequest;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.BookType;

public class CreateBookRequest implements RestInboundRequest {
    String bookName;
    BookType type;
}
