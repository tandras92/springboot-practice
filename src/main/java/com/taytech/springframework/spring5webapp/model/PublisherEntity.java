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
public class PublisherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @Override
    public String toString() {
        return "PublisherEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PublisherEntity that = (PublisherEntity) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
