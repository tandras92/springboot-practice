package com.taytech.springframework.spring5webapp.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorDto {

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private Set<BookDto> bookDtos = new HashSet<>();

    public AuthorDto(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}