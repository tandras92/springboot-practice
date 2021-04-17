package com.taytech.springframework.spring5webapp.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AuthorDto {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Set<BookDto> bookDtos = new HashSet<>();

    public AuthorDto() {}

    public AuthorDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

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

    public Set<BookDto> getBookDtos() {
        return bookDtos;
    }

    public void setBookDtos(Set<BookDto> bookDtos) {
        this.bookDtos = bookDtos;
    }
}