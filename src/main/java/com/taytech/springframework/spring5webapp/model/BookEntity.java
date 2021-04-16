package com.taytech.springframework.spring5webapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class BookEntity {

    @EmbeddedId
    private BookPK bookPK;

    @Column(name = "book_title", nullable = false, length = 75)
    private String title;

    @Column(name = "book_isbn", nullable = false, length = 13)
    private String isbn;

    @ManyToOne
    private PublisherEntity publisher;

    @Column(name = "book_genre", nullable = false, length = 75)
    private String genre;

    @ManyToMany
    @JoinTable(name = "author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<AuthorEntity> authors;



    @Override
    public String toString() {
        return "BookEntity{" +
                "bookPK=" + bookPK +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher=" + publisher +
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
