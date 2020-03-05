package io;

import model.Book;
import model.Magazine;

import java.util.Scanner;

public class DataReader {
    private Scanner sc = new Scanner(System.in);

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = sc.nextInt();
        sc.nextLine();
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytul: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("Isbn: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int relaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilosc stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

        return new Book(title, author, relaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine(){
        System.out.println("Tytul:");
        String title = sc.nextLine();
        System.out.println("Wydawnictwo:");
        String publisher = sc.nextLine();
        System.out.println("Jezyk:");
        String language = sc.nextLine();
        System.out.println("Rok wydania");
        int year = sc.nextInt();
        System.out.println("Miesiac:");
        int mounth = sc.nextInt();
        System.out.println("Dzien");
        int day = sc.nextInt();

        return new Magazine(title, publisher, year, language, day, mounth);
    }
}
