package com.library.Services;

import com.library.Model.Book;

public interface BookService {
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public Book getBook(int id);
    public void deleteBook(int id);
}
