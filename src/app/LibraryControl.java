package app;

import io.DataReader;
import model.Book;
import model.Library;

public class LibraryControl {

    private static final int exit = 0;
    private static final int addBook = 1;
    private static final int printBooks = 2;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case addBook:
                    addBook();
                    break;
                case printBooks:
                    printBooks();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadz inna liczbe.");
            }
        }while (option != exit);
    }

    private void exit() {
        System.out.println("Koniec programu");
        dataReader.close();
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void printOptions() {
        System.out.println("Wybierz opcje: ");
        System.out.println(exit + " - Wyjscie z programu");
        System.out.println(addBook + " - Dodanie nowej ksiazki");
        System.out.println(printBooks + " - Wyswietl dostepne ksiazki");
    }
}
