package com.taytech.springframework.spring5webapp.faker;

import com.github.javafaker.Faker;

public class FakerObject {

    Faker faker = new Faker();

    String authorFirstName = faker.name().firstName();
    String authorLastName = faker.name().lastName();
    String bookTitle = faker.book().title();
    String bookPublisher = faker.book().publisher();
}
