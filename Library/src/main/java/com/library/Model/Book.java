package com.library.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookId;
    private String title;
    private String authorName;
    private String publisher;
    private String publisherYear;
    private int price;

    public Book() {
    }

    public Book(int bookId, String title, String authorName, String publisher, String publisherYear, int price) {
        this.bookId = bookId;
        this.title = title;
        this.authorName = authorName;
        this.publisher = publisher;
        this.publisherYear = publisherYear;
        this.price = price;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPublisherYear(String publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getPublisherYear() {
        return publisherYear;
    }

    public int getPrice() {
        return price;
    }
}
