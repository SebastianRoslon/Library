package model;

public class Library {

    private static final int MAX_PUBLICATIONS = 200;
    private int publicatonNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public void addBook(Book book) {
        if (publicatonNumber < MAX_PUBLICATIONS) {
            publications[publicatonNumber] = book;
            publicatonNumber++;
        } else {
            System.out.println("Maksymalna liczba ksiazek zastala osiagnieta.");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicatonNumber; i++) {
            if (publications[i] instanceof Book) {
                publications[i].printInfo();
                countBooks++;
            }
        }
        if (countBooks == 0) {
            System.out.println("Brak ksiazek w bibliotece.");
        }
    }
        public void addMagazine (Magazine magazine){
            if (publicatonNumber < MAX_PUBLICATIONS) {
                publications[publicatonNumber] = magazine;
                publicatonNumber++;
            } else {
                System.out.println("Maksymalna liczba magazynow zostala osiagnieta");
            }
        }

        public void printMagazines () {
            int countMagazines = 0;
            for (int i = 0; i < publicatonNumber; i++) {
                if (publications[i] instanceof Magazine){
                    publications[i].printInfo();
                    countMagazines++;
                }
            }
            if (countMagazines == 0){
                System.out.println("Brak magazynow w bibliotece.");
            }
        }
    }

