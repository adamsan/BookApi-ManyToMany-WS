package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.model.Book;
import com.example.bookapimanytomany.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    public Book save(@RequestBody @Valid Book book
//            , BindingResult errors
    ) {
//        if (!errors.hasErrors()) {
//            return bookService.save(book);
//        }
        return bookService.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void delete(@PathVariable("id") Integer id) {
        bookService.deleteById(id);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(
            MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        List<ObjectError> allErrors = ex.getBindingResult().getAllErrors();
        errors.put("number_of_errors", String.valueOf(allErrors.size()));
        allErrors.forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }
}
