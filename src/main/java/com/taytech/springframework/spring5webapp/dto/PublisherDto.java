package com.taytech.springframework.spring5webapp.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherDto {

    @NotNull
    private String name;

    @NotNull
    private String address;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    private String zipcode;

    @NotNull
    private Set<BookDto> bookDtos = new HashSet<>();
}
