package com.example.demo.services;

import com.example.demo.repositories.BookRepository;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micrometer.prometheusmetrics.PrometheusMeterRegistry;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final MeterRegistry meterRegistry;
    private final BookRepository bookRepository;


    public BookService(MeterRegistry meterRegistry, BookRepository bookRepository) {
        this.meterRegistry = meterRegistry;
        this.bookRepository = bookRepository;

    }


    public String addBook() {

        meterRegistry.gauge("error_add_books", 1);
        return "OK";
    }

    public Integer qntBook() {
        meterRegistry.gauge("qnt_books", bookRepository.countBooks());
        return bookRepository.countBooks();
    }
}