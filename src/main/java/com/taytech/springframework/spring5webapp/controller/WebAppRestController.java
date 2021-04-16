package com.taytech.springframework.spring5webapp.controller;

import com.taytech.springframework.spring5webapp.service.AuthorService;
import com.taytech.springframework.spring5webapp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppRestController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;



}
