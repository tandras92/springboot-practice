package com.taytech.springframework.spring5webapp.service;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface BookService {

    BookDto processEvent(BookDto bookDto);

    Optional<BookEntity> findBookById(UUID bookId);

    BookEntity convertBooksToEntity(BookDto bookDto);

    List<BookEntity> findAll();
}
