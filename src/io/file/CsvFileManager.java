package io.file;

import exception.DataExportException;
import exception.DataImportException;
import exception.InvalidDataException;
import model.Book;
import model.Library;
import model.Publication;

import javax.swing.event.SwingPropertyChangeSupport;
import java.io.*;
import java.util.Scanner;

public class CsvFileManager implements FileManager{
    private static final String FILE_NAME = "Library.csv";

    @Override
    public void exportData(Library library){
        Publication[] publications = library.getPublications();
        try(FileWriter fileWriter = new FileWriter(FILE_NAME);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (Publication publication : publications){
                bufferedWriter.write(publication.toCsv());
                bufferedWriter.newLine();
            }
        }catch (IOException e){
            throw new DataExportException("Blad zapisu danych do plku " + FILE_NAME);
        }
    }

    @Override
    public Library importData(){
        Library library = new Library();
        try(Scanner fileReader = new Scanner(new File(FILE_NAME))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                Publication publication = createObjectFromString(line);
                library.addPublication(publication);
            }
        }catch (FileNotFoundException e){
            throw new DataImportException("Brak pliku " + FILE_NAME);
        }
        return library;
    }

    private Publication createObjectFromString(String csvText){
        String[] split = csvText.split(";");
        String type = split[0];
        if(Book.TYPE.equals(type)){
            return createMagazine(split);
        }
        throw new InvalidDataException("Nieznany typ publikacji: " +type)
    }

}
