package com.taytech.springframework.spring5webapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class BookEntity {

    @EmbeddedId
    private BookPK bookPK;

    @Column(name = "book_title", nullable = false, length = 75)
    private String title;

    private String isbn;

    private String genre;

    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<AuthorEntity> authors;

    public BookEntity(BookPK bookPK, String title, String isbn, String genre, Set<AuthorEntity> authors) {
        this.bookPK = bookPK;
        this.title = title;
        this.isbn = isbn;
        this.genre = genre;
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookPK=" + bookPK +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre='" + genre + '\'' +
                ", authors=" + authors +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookEntity that = (BookEntity) o;

        return bookPK.equals(that.bookPK);
    }

    @Override
    public int hashCode() {
        return bookPK.hashCode();
    }
}
