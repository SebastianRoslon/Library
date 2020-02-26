package HospitalEx;



 class Hospital {

    private final int maxPatientsNumber = 10;                       //maxymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber];    //tablica na pacjentów
    private int regPatiens = 0;                                     //aktualna liczba pacjentów


    public void addPatient(Patient patient) {
        if (regPatiens < maxPatientsNumber) {
            patients[regPatiens] = patient;
            regPatiens++;
        } else {
            System.out.println("Zapisano maxymalną liczbę pacjentów, zapraszamy jutro!");
        }
    }


    public void printPatients() {
        for (int i = 0; i < regPatiens; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPesel());
        }
    }
}

