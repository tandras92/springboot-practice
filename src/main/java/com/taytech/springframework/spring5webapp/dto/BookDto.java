package com.taytech.springframework.spring5webapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("id")
    private UUID id;

    @NotNull
    @JsonProperty("title")
    private String title;

    @NotNull
    @JsonProperty("isbn")
    private String isbn;

    @NotNull
    @JsonProperty("genre")
    private String genre;

    @NotNull
    @JsonProperty("createdDate")
    private LocalDateTime createdDate;

    @NotNull
    @JsonProperty("returnedDate")
    private LocalDateTime returnedDate;

    @NotNull
    @JsonProperty("publisherId")
    private PublisherEntity publisherId;

    @NotNull
    @JsonProperty("authors")
    private Set<AuthorDto> authors = new HashSet<>();

    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }
}