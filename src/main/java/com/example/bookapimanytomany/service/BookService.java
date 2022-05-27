package com.example.bookapimanytomany.service;

import com.example.bookapimanytomany.model.Book;
import com.example.bookapimanytomany.repository.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookDAO bookDAO;

    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    public Optional<Book> findById(Integer id) {
        return bookDAO.findById(id);
    }

    public Book save(Book book) {
        return bookDAO.save(book);
    }
}
