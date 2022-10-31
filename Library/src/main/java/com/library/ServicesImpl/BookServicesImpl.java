package com.library.ServicesImpl;

import com.library.Model.Book;
import com.library.Repository.BookRepo;
import com.library.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServicesImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;
    @Override
    public Book addBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookRepo.save(book);
    }

    @Override
    public Book getBook(int id) {
        return this.bookRepo.findById(id);
    }

    @Override
    public void deleteBook(int id) {
        this.bookRepo.deleteById(id);
    }

}
