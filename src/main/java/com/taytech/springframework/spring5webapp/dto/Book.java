package com.taytech.springframework.spring5webapp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Book {

    @NotNull
    private String title;

    @NotNull
    private String isbn;

    @NotNull
    private String genre;

    @NotNull
    private Set<Author> authors;

    public Book() {}

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

}

