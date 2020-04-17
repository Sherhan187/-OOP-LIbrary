# -OOP-LIbrary
Classes book and reader and libary
package com.company;

import java.util.LinkedList;

public class Reader {
    public String fullname;
    int passportNumber;
    LinkedList<Book> books = new LinkedList<Book>();


    public Reader(String reader, int PN){
        this.fullname = fullname;
        this.passportNumber = PN;
    }

    public String getReader() {
        return fullname;
    }

    public void setReader(String reader) {
        this.fullname = fullname;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(int passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void addBook(Book a) {
        this.books.add(a);
    }
    public void getBooks() {
        for(int i = 0; i < this.books.size(); ++i){
            System.out.println(this.books.get(i).title);
        }
    }
}

