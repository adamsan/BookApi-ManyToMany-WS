package com.example.bookapimanytomany.repository;

import com.example.bookapimanytomany.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
}
