# -OOP-LIbrary
Classes book and reader and libary
package com.company;

public class Main {
    public static void main(String[] args){
        Reader Khan = new Reader("J Joe", 46876);
        Reader Jame = new Reader ("Jame J", 68746);

        Library Abay = new Library("Astana","Abay");

        Book HarryPotter = new Book("Harry Potter and deathly hallows");
        Book Flow = new Book("Flowers");
        Book Three = new Book ("Three metres");

        Abay.addBook(HarryPotter);
        Abay.addBook(Flow);
        Abay.addBook(Three);

        Abay.addReader(Khan);
        Abay.addReader(Jame);

        Khan.addBook(Flow);
        Khan.addBook(Three);
        Jame.addBook(HarryPotter);

        Abay.address = "Astana";

        System.out.println("Abay books");
        Abay.getBooks();
        Abay.getReaders();
        Khan.getBooks();
        Jame.getBooks();
    }
}


