package com.taytech.springframework.spring5webapp.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    @NotNull
    private String title;

    @NotNull
    private String isbn;

    @NotNull
    private String genre;

    @NotNull
    private PublisherDto publisherDto;

    @NotNull
    private Set<AuthorDto> authorDtos = new HashSet<>();

    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
}

