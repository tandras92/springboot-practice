package com.taytech.springframework.spring5webapp.service.impl;

import com.taytech.springframework.spring5webapp.dto.BookDto;
import com.taytech.springframework.spring5webapp.mapper.BookMapper;
import com.taytech.springframework.spring5webapp.model.BookEntity;
import com.taytech.springframework.spring5webapp.repository.BookRepository;
import com.taytech.springframework.spring5webapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(final BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }


    @Override
    public BookDto processEvent(BookDto bookDto) {
        BookEntity bookEntity = this.convertBooksToEntity(bookDto);

        BookEntity bookEntitySaved = bookRepository.saveAndFlush(bookEntity);

        bookDto.setCreatedDate(bookEntitySaved.getRecordCreateTime());

        return bookDto;
    }

    @Override
    public Optional<BookEntity> findBookById(UUID bookId) {
        return bookRepository.findById(bookId);
    }

    @Override
    public BookEntity convertBooksToEntity(BookDto bookDto) {
        return bookMapper.convertBookDtoToEntity(bookDto);
    }

    @Override
    public List<BookEntity> findAll() {
        return bookRepository.findAll();
    }


//    private void saveBook(final BookDto bookDto) {
//        BookEntity bookResults = convertBooksToEntity(bookDto);
//
//        try {
//            bookRepository.saveAndFlush(bookResults);
//        } catch (IOError ioError) {
//            System.out.println("error");
//        }
//    }

}
