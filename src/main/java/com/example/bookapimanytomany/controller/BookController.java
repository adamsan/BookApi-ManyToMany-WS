package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.model.Book;
import com.example.bookapimanytomany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> findById(@PathVariable("id") Integer id) {
        return bookService.findById(id);
    }
}
