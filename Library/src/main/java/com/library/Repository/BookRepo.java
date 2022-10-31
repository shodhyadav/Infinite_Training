package com.library.Repository;

import com.library.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Integer> {
    public Book findById(int id);
}
