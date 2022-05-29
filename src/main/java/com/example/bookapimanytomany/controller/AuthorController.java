package com.example.bookapimanytomany.controller;

import com.example.bookapimanytomany.model.Author;
import com.example.bookapimanytomany.service.AuthorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/author/{id}")
    @Operation(
            summary = "gets all authors",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Responds with a list of Author entities."),
                    @ApiResponse(responseCode = "400", description = "Author by the given id not found.")
            }
    )
    public Author findById(
            @Parameter(
                    name = "id",
                    description = "id of the author",
                    schema = @Schema(description = "id", minimum = "1", type = "int"),
                    required = true
            )
            @PathVariable("id") Integer id) {
        return authorService.findById(id).orElseThrow();
    }

    @PostMapping("/author")
    public Author create(@RequestBody Author author) {
        return authorService.save(author);
    }
}
