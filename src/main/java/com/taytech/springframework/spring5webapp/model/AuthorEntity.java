package com.taytech.springframework.spring5webapp.model;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Component
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "author_id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "first_nm", columnDefinition = "varchar", nullable = false, length = 75)
    private String firstName;

    @Column(name = "last_nm", columnDefinition = "varchar", nullable = false, length = 75)
    private String lastName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "author_book",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    private Set<BookEntity> books = new HashSet<>();

}
