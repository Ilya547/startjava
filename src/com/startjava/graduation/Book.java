package com.startjava.graduation;

public class Book {
    private String author;
    private String title;
    private String yearPublication;

    public Book(String author, String title, String yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return author + ", " + title +  ", " + yearPublication + ">\n";
    }
}