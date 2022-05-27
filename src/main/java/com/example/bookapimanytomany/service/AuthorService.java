package com.example.bookapimanytomany.service;

import com.example.bookapimanytomany.model.Author;
import com.example.bookapimanytomany.repository.AuthorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorDAO authorDAO;

    public List<Author> findAll() {
        return authorDAO.findAll();
    }

    public Optional<Author> findById(Integer id) {
        return authorDAO.findById(id);
    }

    public Author save(Author author) {
        return authorDAO.save(author);
    }
}
