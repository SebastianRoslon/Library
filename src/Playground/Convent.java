package Playground;

import java.util.Scanner;

public class Convent {
    DataReader dataReader = new DataReader();

    final int exit = 0;
    final int conventerMeterOnKilometer = 1;
    final int conventerKilometerOnMeter = 2;
    final int kilometerOnMile = 3;
    final int mileOnKilometer = 4;

    void ControlLoop() {
        int option;
        do {
            printOptions();
            option = dataReader.getInt();
            switch (option) {
                case conventerMeterOnKilometer:
                    conventerMeterOnKilometer();
                    break;
                case conventerKilometerOnMeter:
                    conventerKilometerOnMeter();
                    break;
                case kilometerOnMile:
                    kilometerOnMile();
                    break;
                case mileOnKilometer:
                    mileOnKilometer();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
            }
        } while (option != exit);
    }

    void conventerMeterOnKilometer() {
        System.out.println("Ile metrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumKilometer = howMany * 1000;
        System.out.println(sumKilometer + "\n \n");
    }

    void conventerKilometerOnMeter() {
        System.out.println("Ile kilometrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany / 1000;
        System.out.println(sumMeter + "\n \n");
    }

    void kilometerOnMile() {
        System.out.println("Ile kilometrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany * 1.6;
        System.out.printf("%f kilometrow to %f mil. \n \n", howMany, sumMeter);
    }

    void mileOnKilometer() {
        System.out.println("Ile mil chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany * 0.625;
        System.out.printf("%f mil to %f kilometrow. \n \n", howMany, sumMeter);
    }


    void printOptions() {
        System.out.println("Co chcesz zamienic?");
        System.out.println(exit + " - wyjscie z programu");
        System.out.println(conventerMeterOnKilometer + " - Metry na kilomerty");
        System.out.println(conventerKilometerOnMeter + " - Kilometry na metry");
        System.out.println(kilometerOnMile + " - Kilometry na mile");
        System.out.println(mileOnKilometer + " - Mile na kilometry");
    }

    private void exit() {
        System.out.println("Koniec programu");
        dataReader.close();
    }

}
