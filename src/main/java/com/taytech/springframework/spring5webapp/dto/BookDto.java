package com.taytech.springframework.spring5webapp.dto;

import com.taytech.springframework.spring5webapp.model.PublisherEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookDto {

    @NotNull
    private UUID uuid;

    @NotNull
    private String title;

    @NotNull
    private String isbn;

    @NotNull
    private String genre;

    @NotNull
    private LocalDateTime createdDate;

    @NotNull
    private LocalDateTime returnedDate;

    @NotNull
    private PublisherEntity publisherId;

    @NotNull
    private Set<AuthorDto> authorDtos = new HashSet<>();

    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
}