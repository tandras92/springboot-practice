package com.taytech.springframework.spring5webapp.bootstrap;

import com.taytech.springframework.spring5webapp.dto.AuthorDto;
import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.faker.FakerObject;
import com.taytech.springframework.spring5webapp.repository.AuthorRepository;
import com.taytech.springframework.spring5webapp.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        FakerObject fakerObject = new FakerObject();

        String authorFirstName = fakerObject.getAuthorFirstName();
        String authorLastName = fakerObject.getAuthorLastName();
        String bookTitle = fakerObject.getBookTitle();
        String bookPublisher = fakerObject.getBookPublisher();
        String bookGenre = fakerObject.getBookGenre();

        AuthorDto authorDto = new AuthorDto(authorFirstName, authorLastName);
        BookDto bookDto = new BookDto(bookTitle, "ISBN 978-2-12-345680-3");

        authorDto.getBookDtos().add(bookDto);
        bookDto.getAuthorDtos().add(authorDto);

       // TODO add test data to DB after mapper is completed
    }
}
