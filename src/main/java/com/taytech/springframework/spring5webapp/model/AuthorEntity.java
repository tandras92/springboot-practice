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
public class AuthorEntity {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(length = 36, columnDefinition = "varchar", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "first_nm", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_nm", nullable = false, length = 75)
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<BookEntity> books;
}
