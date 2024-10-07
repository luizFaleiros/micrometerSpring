package com.example.demo.repositories;

import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;

@Component
public class BookRepository {
    AtomicInteger qntBooks = new AtomicInteger(0);

    public Integer countBooks() {
        return qntBooks.get();
    }

    public void addBook() {
        qntBooks.addAndGet(1);
    }
}
