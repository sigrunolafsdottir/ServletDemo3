package com.example.ServletDemo3.dao;


import com.example.ServletDemo3.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO{

    List<Book> bookList = new ArrayList<>();

    public BookDAO(){
        Book b1 = new Book(1, "Wuthering Heights", "Emily Bronte");
        Book b2 = new Book(2, "Jayne Eyre", "Charlotte Bronte");
        Book b3 = new Book(3, "Crime and Punishment", "Fjodor Dostovjevsky");
        Book b4 = new Book(4, "Madame Bovary", "Gustave Flaubert");
        Book b5 = new Book(5, "Catcher in the Rye", "J.D. Salinger");
        Book b6 = new Book(6, "Pale King", "David Foster Wallace");
        Book b7 = new Book(7, "Sandman, vol 1", "Neil Gaiman");

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);
        bookList.add(b5);
        bookList.add(b6);
        bookList.add(b7);
    }

    public List<Book> getAllBooks() {
        return bookList;
    }

    public String getBookInfo(String title){
        System.out.println("in getBookINfo "+title);
        for (Book b : bookList ){
            System.out.println("in getBookINfo loop "+title);
            if (b.getTitle().trim().equalsIgnoreCase(title)){
                return b.getTitle()+" "+b.getAuthor();
            }
        }
        return null;
    }

}