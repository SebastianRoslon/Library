package io;

import model.Book;
import model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);
    private ConsolePrinter printer;

    public DataReader(ConsolePrinter printer) {
        this.printer = printer;
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        try{
            return sc.nextInt();
        }finally {
            sc.nextLine();
        }
    }

    public Book readAndCreateBook() {
        printer.printLine("Tytul: ");
        String title = sc.nextLine();
        printer.printLine("Autor: ");
        String author = sc.nextLine();
        printer.printLine("Wydawnictwo: ");
        String publisher = sc.nextLine();
        printer.printLine("Isbn: ");
        String isbn = sc.nextLine();
        printer.printLine("Rok wydania: ");
        int relaseDate = getInt();
        sc.nextLine();
        printer.printLine("Ilosc stron: ");
        int pages = getInt();

        return new Book(title, author, relaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine(){
        printer.printLine("Tytul:");
        String title = sc.nextLine();
        printer.printLine("Wydawnictwo:");
        String publisher = sc.nextLine();
        printer.printLine("Jezyk:");
        String language = sc.nextLine();
        printer.printLine("Rok wydania");
        int year = sc.nextInt();
        printer.printLine("Miesiac:");
        int month = getInt();
        printer.printLine("Dzien");
        int day = getInt();

        return new Magazine(title, publisher, year, language, day, month);
    }
}
