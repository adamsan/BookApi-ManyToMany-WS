package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.model.Book;
import com.example.bookapimanytomany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/book")
    public Book save(@RequestBody Book book) {
        return bookService.save(book);
    }
}
