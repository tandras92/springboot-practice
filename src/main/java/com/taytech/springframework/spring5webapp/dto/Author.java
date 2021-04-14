package com.taytech.springframework.spring5webapp.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Set;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Author {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Set<Book> books;

    public Author() {}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}