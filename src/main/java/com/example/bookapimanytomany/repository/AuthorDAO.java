package com.example.bookapimanytomany.repository;

import com.example.bookapimanytomany.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorDAO extends JpaRepository<Author, Integer> {

    @Query("select distinct a from Author a left join fetch a.books")
    List<Author> findAll();

    Author save(Author a);
}
