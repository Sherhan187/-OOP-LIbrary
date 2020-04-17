# -OOP-LIbrary
Classes book and reader and libary
package com.company;

public class Book {
    public String title;
    public boolean notFree;

    public Book( String title, String free, boolean notFree){
        this.notFree = notFree;
        this.title = title;
    }

    public Book(String bookTitle) {
        title = bookTitle;
        notFree = false;
    }
    public void notFree(){
        notFree = true;
    }
    public boolean isNotFree() {
        if(notFree) {
            return true;
        } else
            return false;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


}
