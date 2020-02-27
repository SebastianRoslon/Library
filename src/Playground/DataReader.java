package Playground;

import java.util.Scanner;

public class DataReader {

    Scanner scanner = new Scanner(System.in);

    public int getInt() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public void close(){
        scanner.close();
    }
}
