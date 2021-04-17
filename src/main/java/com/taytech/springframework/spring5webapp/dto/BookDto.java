package com.taytech.springframework.spring5webapp.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
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

    public BookDto() {}

    public BookDto(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public PublisherDto getPublisherDto() {
        return publisherDto;
    }

    public void setPublisherDto(PublisherDto publisherDto) {
        this.publisherDto = publisherDto;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<AuthorDto> getAuthorDtos() {
        return authorDtos;
    }

    public void setAuthorDtos(Set<AuthorDto> authorDtos) {
        this.authorDtos = authorDtos;
    }

}

