package com.taytech.springframework.spring5webapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Component
@Table(name = "book")
public class BookEntity {

    @Id
    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "book_id", columnDefinition = "uuid", nullable = false)
    private UUID bookId;

    @Column(name = "record_create_ts", nullable = false)
    private LocalDateTime recordCreateTime;

    @Column(name = "book_title", columnDefinition = "varchar", nullable = false, length = 75)
    private String title;

    @Column(name = "book_isbn", columnDefinition = "varchar", nullable = false, length = 13)
    private String isbn;

    @Column(name = "book_genre", columnDefinition = "varchar", nullable = false, length = 75)
    private String genre;

    @ManyToOne
    private PublisherEntity publishers;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<AuthorEntity> authors;


//    @PrePersist
//    private void prePersist() {
//        if (bookPK == null) {
//            BookPK pk = new BookPK();
//            pk.setBookId(getBookPK().getBookId());
//        } else {
//            log.debug("Error located in " + BookEntity.class.getSimpleName());
//        }
//    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "bookId=" + bookId +
                ", recordCreateTime=" + recordCreateTime +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genre='" + genre + '\'' +
                ", publishers=" + publishers +
                ", authors=" + authors +
                '}';
    }
}
