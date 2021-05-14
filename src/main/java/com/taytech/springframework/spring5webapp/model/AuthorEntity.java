package com.taytech.springframework.spring5webapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "author")
public class AuthorEntity {

    @Id
    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "author_id", columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "first_nm", columnDefinition = "varchar", nullable = false, length = 75)
    private String firstName;

    @Column(name = "last_nm", columnDefinition = "varchar", nullable = false, length = 75)
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<BookEntity> books;

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorEntity that = (AuthorEntity) o;

        assert id != null;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
