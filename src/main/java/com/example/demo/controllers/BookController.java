package com.example.demo.controllers;

import com.example.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/books")
@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/add", name = "add")
    public ResponseEntity<String> addBook() {
        return ResponseEntity.ok(bookService.addBook());
    }

    @GetMapping
    public ResponseEntity<Integer> qntBook() {
        return ResponseEntity.ok(bookService.qntBook());
    }
}
