package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.model.Author;
import com.example.bookapimanytomany.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/author/{id}")
    public Optional<Author> findById(@PathVariable("id") Integer id) {
        return authorService.findById(id);
    }
}
