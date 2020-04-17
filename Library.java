# -OOP-LIbrary
Classes book and reader and libary
package com.company;

import java.util.LinkedList;

public class Library {
    public String address;
    String name;
    LinkedList<Reader> readers = new LinkedList<Reader>();
    LinkedList<Book> books = new LinkedList<Book>();

    public Library(String address, String name){
        this.address = address;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public  void addReader(Reader a1){
        this.readers.add(a1);
    }
    public void addBook(Book b1){
        this.books.add(b1);
    }
    public void getReaders() {
        for(int i = 0; i < this.readers.size(); ++i){
            System.out.println(this.readers.get(i).fullname);
        }
    }

    public void getBooks() {
        for(int i = 0; i < this.books.size(); ++i){
            System.out.println(this.books.get(i).title);
        }
    }
}
