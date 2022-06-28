package com.startjava.graduation_project_SJ;

public class Book {
    private String author;
    private String title;
    private String yearPublication;

    public Book(String author, String title, String yearPublication) {
        this.author = author;
        this.title = title;
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getYearPublication() {
        return yearPublication;
    }

}

