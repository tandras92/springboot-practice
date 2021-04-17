package com.taytech.springframework.spring5webapp.controller;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.service.AuthorService;
import com.taytech.springframework.spring5webapp.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/library/catalog")
@RestController
public class WebAppRestController {

    private final AuthorService authorService;

    private final BookService bookService;

    public WebAppRestController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @GetMapping({"/{bookId}"})
    public ResponseEntity<BookDto> getBook(@PathVariable UUID bookId) {
        return new ResponseEntity<>(bookService.getBookById(bookId), HttpStatus.OK);
    }

}
