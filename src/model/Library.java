package model;

public class Library {

    private static final int maxBooks = 100;
    private Book[] books = new Book[maxBooks];
    private int booksNumber = 0;

    public void addBook(Book book) {
        if (booksNumber < maxBooks) {
            books[booksNumber] = book;
            booksNumber++;
        } else {
            System.out.println("Maksymalna liczba ksiazek zastala osiagnieta.");
        }
    }

    public void printBooks() {
        if (booksNumber == 0) {
            System.out.println("Brak ksiazek w bibliotece.");
        }

        for (int i = 0; i < booksNumber; i++) {
            books[i].printInfo();
        }

    }
}
