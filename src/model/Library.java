package model;

public class Library {

    private static final int MAX_PUBLICATIONS = 2000;
    private int publicatonNumber;
    private Publication[] publications = new Publication[MAX_PUBLICATIONS];

    public Publication[] getPublications() {
        Publication[] result = new Publication[publicatonNumber];
        for (int i = 0; i < publicatonNumber; i++) {
            result[i] = publications[i];
        }
        return result;
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication publication) {
        if (publicatonNumber >= MAX_PUBLICATIONS) {
            throw new ArrayIndexOutOfBoundsException("Max publication exceeded" + MAX_PUBLICATIONS);
        }
        publications[publicatonNumber] = publication;
        publicatonNumber++;
    }
}


