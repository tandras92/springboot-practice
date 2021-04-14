package com.taytech.springframework.spring5webapp.model;

import com.taytech.springframework.spring5webapp.dto.Author;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.Set;

@Entity
public class BookEntity {

    @EmbeddedId
    private BookPK bookPK;

    @Column(name = "book_title", nullable = false, length = 75)
    private String title;

    private String isbn;

    private String genre;

    private Set<Author> authors;
}
