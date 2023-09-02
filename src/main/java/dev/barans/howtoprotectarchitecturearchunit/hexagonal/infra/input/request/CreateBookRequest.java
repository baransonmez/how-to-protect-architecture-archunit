package dev.barans.howtoprotectarchitecturearchunit.hexagonal.infra.input.request;

import dev.barans.howtoprotectarchitecturearchunit.common.RestInboundRequest;
import dev.barans.howtoprotectarchitecturearchunit.hexagonal.domain.model.BookType;

public record CreateBookRequest(String bookName,
                                BookType type) implements RestInboundRequest {

}
