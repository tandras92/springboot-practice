package com.taytech.springframework.spring5webapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PublisherEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "publisher_nm", nullable = false, length = 50)
    private String name;

    @Column(name = "publisher_address", nullable = false, length = 50)
    private String address;

    @Column(name = "publisher_city", nullable = false, length = 50)
    private String city;

    @Column(name = "publisher_state_cd", nullable = false, columnDefinition = "char(2)")
    private String state;

    @Column(name = "publisher_zipcode", nullable = false, columnDefinition = "char(5)" )
    private String zipcode;

    @OneToMany
    @JoinColumn(name = "publisher_id")
    private Set<BookEntity> books;

    public Set<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(Set<BookEntity> books) {
        this.books = books;
    }
}
