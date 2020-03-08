package model;

public class Book extends Publication {
    //pola
    private String author;
    private int pages;
    private String isbn;

    //konstruktor
    public Book(String title, String author, int year, int pages, String publisher, String isbn) {
        super(title, publisher, year);
        this.pages = pages;
        this.author = author;
        this.isbn = isbn;
    }

    //gettery i settery
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public void printInfo() {
        String info = getTitle() + "; " + author + "; " + getYear() + "; " + pages + "; " + getPublisher() + "; " + isbn + ";";
        System.out.println(info);
    }
}



