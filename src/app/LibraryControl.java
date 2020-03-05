package app;

import io.DataReader;
import model.Book;
import model.Library;
import model.Magazine;

public class LibraryControl {

    //stale do kontrolowania programu
    private static final int EXIT = 0;
    private static final int ADD_BOOK = 1;
    private static final int ADD_MAGAZINE = 2;
    private static final int PRINT_BOOKS = 3;
    private static final int PRINT_MAGAZINES = 4;

    private DataReader dataReader = new DataReader();
    private Library library = new Library();

    public void controlLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case ADD_BOOK:
                    addBook();
                    break;
                case ADD_MAGAZINE:
                    addMagazine();
                    break;
                case PRINT_BOOKS:
                    printBooks();
                    break;
                case PRINT_MAGAZINES:
                    printMagazines();
                    break;
                case EXIT:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wprowadz inna liczbe.");
            }
        }while (option != EXIT);
    }

    private void printOptions() {
        System.out.println("Wybierz opcje: ");
        System.out.println(EXIT + " - Wyjscie z programu");
        System.out.println(ADD_BOOK + " - Dodanie nowej ksiazki");
        System.out.println(ADD_MAGAZINE + " - Dodanie nowego magazynu");
        System.out.println(PRINT_BOOKS + " - Wyswietl dostepne ksiazki");
        System.out.println(PRINT_MAGAZINES + " - Wyswietl dostepne magazyny");
    }

    private void printBooks() {
        library.printBooks();
    }

    private void addBook() {
        Book book = dataReader.readAndCreateBook();
        library.addBook(book);
    }

    private void addMagazine() {
        Magazine magazine = dataReader.readAndCreateMagazine();
        library.addMagazine(magazine);
    }

    private void printMagazines(){
        library.printMagazines();
    }

    private void exit() {
        System.out.println("Koniec programu");
        dataReader.close();
    }
}
