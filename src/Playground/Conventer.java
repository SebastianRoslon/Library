package Playground;

public class Conventer {
    DataReader dataReader = new DataReader();

    private static final int exit = 0;
    private static final int conventerMeterOnKilometer = 1;
    private static final int conventerKilometerOnMeter = 2;
    private static final int kilometerOnMile = 3;
    private static final int mileOnKilometer = 4;
    private static final int mixRatio = 5;

    public void ControlLoop() {
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
                case mixRatio:
                    mixRatio();
                    break;
                case exit:
                    exit();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji.");
            }
        } while (option != exit);
    }

    private void conventerMeterOnKilometer() {
        System.out.println("Ile metrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumKilometer = howMany * 1000;
        System.out.println(sumKilometer + "\n \n");
    }

    private void conventerKilometerOnMeter() {
        System.out.println("Ile kilometrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany / 1000;
        System.out.println(sumMeter + "\n \n");
    }

    private void kilometerOnMile() {
        System.out.println("Ile kilometrow chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany * 1.6;
        System.out.printf("%f kilometrow to %f mil. \n \n", howMany, sumMeter);
    }

    private void mileOnKilometer() {
        System.out.println("Ile mil chcesz przeliczyc?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany * 0.625;
        System.out.printf("%f mil to %f kilometrow. \n \n", howMany, sumMeter);
    }

    private void mixRatio() {
        System.out.println("Ile litrow?");
        double howMany = dataReader.howMany();
        double sumMeter = howMany / 50;
        System.out.printf("Dolac %f oleju \n \n", sumMeter);
    }

    private void printOptions() {
        System.out.println("Co chcesz zamienic?");
        System.out.println(exit + " - wyjscie z programu");
        System.out.println(conventerMeterOnKilometer + " - Metry na kilomerty");
        System.out.println(conventerKilometerOnMeter + " - Kilometry na metry");
        System.out.println(kilometerOnMile + " - Kilometry na mile");
        System.out.println(mileOnKilometer + " - Mile na kilometry");
        System.out.println(mixRatio + " - Mix Ratio");
    }

    private void exit() {
        System.out.println("Koniec programu");
        dataReader.close();
    }

}
