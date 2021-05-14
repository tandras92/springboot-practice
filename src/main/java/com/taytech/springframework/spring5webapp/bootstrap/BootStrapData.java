package com.taytech.springframework.spring5webapp.bootstrap;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.dto.PublisherDto;
import com.taytech.springframework.spring5webapp.faker.FakerObject;
import com.taytech.springframework.spring5webapp.service.AuthorService;
import com.taytech.springframework.spring5webapp.service.BookService;
import com.taytech.springframework.spring5webapp.service.PublisherService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class BootStrapData implements CommandLineRunner {

    private final BookService bookService;
    private final AuthorService authorService;
    private final PublisherService publisherService;

    public BootStrapData(BookService bookService, AuthorService authorService, PublisherService publisherService) {

        this.bookService = bookService;
        this.authorService = authorService;
        this.publisherService = publisherService;
    }

    @Override
    public void run(String... args) throws Exception {
        FakerObject fakerObject = new FakerObject();

        String authorFirstName = fakerObject.getAuthorFirstName();
        String authorLastName = fakerObject.getAuthorLastName();
        String bookTitle = fakerObject.getBookTitle();
        String bookGenre = fakerObject.getBookGenre();
        String bookISBN = isbn13Generator();
        String publisherName = fakerObject.getPublisherName();
        String publisherAddress = fakerObject.getPublisherAddress();
        String publisherCity = fakerObject.getPublisherCity();
        String publisherState = fakerObject.getPublisherState();
        String publisherZipCode = fakerObject.getPublisherZipCode();

        PublisherDto publisherDto = PublisherDto.builder()
        .id(UUID.randomUUID())
        .name(publisherName)
        .address(publisherAddress)
        .city(publisherCity)
        .state(publisherState)
        .zipcode(publisherZipCode)
        .build();



        BookDto bookDto = BookDto.builder()
                .uuid(UUID.randomUUID())
                .title(bookTitle)
                .genre(bookGenre)
                .isbn(bookISBN)
                .publisherDto(publisherDto)
                .createdDate(LocalDateTime.now())
                .returnedDate(LocalDateTime.now().plusDays(6))
                .build();


        AuthorDto authorDto = AuthorDto.builder()
                .id(UUID.randomUUID())
                .firstName(authorFirstName)
                .lastName(authorLastName)
                .build();


        bookService.processEvent(bookDto);
        authorService.processEvent(authorDto);
        publisherService.processEvent(publisherDto);
    }

    public static String isbn13Generator() {
        StringBuilder isbn = new StringBuilder();
        int number;

        while(isbn.length() <= 12) {
            number = (int)
                    (Math.random() * 10);
                isbn.append(number);
        }
            return isbn.toString();
    }
}
