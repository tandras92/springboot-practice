package com.taytech.springframework.spring5webapp.faker;

import com.github.javafaker.Faker;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * This class utilizes the Javafaker library to generate fake data.  Find more information here https://github.com/DiUS/java-faker
 */
@Data
@NoArgsConstructor
public class FakerObject {

    Faker faker = new Faker();

    String authorFirstName = faker.name().firstName();
    String authorLastName = faker.name().lastName();
    String bookTitle = faker.book().title();
    String bookGenre = faker.book().genre();
    String publisherName = faker.book().publisher();
    String publisherAddress = faker.address().streetAddress();
    String publisherCity = faker.address().cityName();
    String publisherState = faker.address().stateAbbr();
    String publisherZipCode = faker.address().zipCode();

}
