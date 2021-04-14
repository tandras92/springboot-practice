package com.taytech.springframework.spring5webapp.faker;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class FakerObject {

    Faker faker = new Faker();

    String authorFirstName = faker.name().firstName();
    String authorLastName = faker.name().lastName();
    String bookTitle = faker.book().title();
    String bookPublisher = faker.book().publisher();
    String bookGenre = faker.book().genre();
}
