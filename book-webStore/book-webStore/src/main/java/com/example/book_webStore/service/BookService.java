package com.example.book_webStore.service;

import com.example.book_webStore.model.Book;
import java.util.List;
import java.util.Optional;

public interface BookService {
    Book saveBook(Book book);
    List<Book> getAllBooks();
    Optional<Book> getBookById(Long id);
    Book updateBook(Long id, Book book);
    void deleteBook(Long id);
}
