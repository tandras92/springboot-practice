package com.taytech.springframework.spring5webapp.controller;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import com.taytech.springframework.spring5webapp.service.BookService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/v1/library/catalog")
@RestController
public class WebAppRestController {

    private final BookService bookService;

//todo: Remove not needed constructor. @AllArgsConsructor will Gen thus for you.
    public WebAppRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping({"/books/{bookId}"})
    public ResponseEntity<BookEntity> getBook(@PathVariable UUID bookId) {

        final Optional<BookEntity> bookDto = bookService.findBookById(bookId);

        return bookDto.map(bookEntity -> new ResponseEntity<>(bookEntity, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(bookDto.get(), HttpStatus.NOT_FOUND));
    }

    @GetMapping("/books")
    public @ResponseBody
    ResponseEntity<List<BookEntity>> getBooks() {
        final List<BookEntity> books = bookService.findAll();

        return new ResponseEntity<>(books, HttpStatus.OK);
    }


    @PostMapping(value = "/books", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BookDto> processEvent(final @RequestBody BookDto bookDto) {
        bookService.processEvent(bookDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
