package com.library.Controller;

import com.library.Exception.HndBookException;
import com.library.Model.Book;
import com.library.ServicesImpl.BookServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookControler {
    @Autowired
    private BookServicesImpl bookServices;
    @PostMapping("/add")
    public Book addBook(@RequestBody Book book){
       return this.bookServices.addBook(book);
   }

   @PutMapping("/update")
   public Book updateBook(@RequestBody Book book){
        return this.bookServices.updateBook(book);
   }
   @GetMapping("/get/{id}")
   public Book getBook(@PathVariable("id") int id){
        return this.bookServices.getBook(id);
   }

   @DeleteMapping("/delete/{id}")
   public void deleteBook(@PathVariable("id") int id) throws HndBookException{
        Book book=this.bookServices.getBook(id);
        if(book==null){
            throw new HndBookException("Service.BOOK_NOT_FOUND");
        }else
        this.bookServices.deleteBook(id);
   }
}
