package com.example.bookapimanytomany.repository;

import com.example.bookapimanytomany.model.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {

    @Query("select distinct b from Book b left join fetch b.author a")
//    @EntityGraph(value = "book_authorship_graph", type = EntityGraph.EntityGraphType.FETCH)
    List<Book> findAll();

    Book save(Book book);
}
