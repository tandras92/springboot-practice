package com.taytech.springframework.spring5webapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
public class PublisherDto {

    @NotNull
    @JsonProperty("id")
    private UUID id;

    @NotNull
    @JsonProperty("name")
    private String name;

    @NotNull
    @JsonProperty("address")
    private String address;

    @NotNull
    @JsonProperty("city")
    private String city;

    @NotNull
    @JsonProperty("state")
    private String state;

    @NotNull
    @JsonProperty("zipcode")
    private String zipcode;

    @NotNull
    @JsonProperty("books")
    private List<BookDto> books = new ArrayList<>();
}
