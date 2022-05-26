package com.example.bookapimanytomany.repository;

import com.example.bookapimanytomany.model.Book;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {
// // Doesn't work, runs this query, then n+1
//    @Query(value = """
//            select * from
//            book b
//            join book_authorship ba on b.id = ba.books_id
//            join author a on ba.author_id = a.id
//            """, nativeQuery = true)
//    List<Book> findAllX();

    @EntityGraph(value = "book_authorship_graph", type = EntityGraph.EntityGraphType.FETCH)
    List<Book> findAll();
}
