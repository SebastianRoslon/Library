package Playground;

public class ComputerStore {
    public static void main(String[] args) {

        Computer comp1 = new Computer();
        Computer comp2 = new Computer();

        comp1.processor = "AMD";
        comp1.memory = 64;

        comp2.processor = "Intel";
        comp2.memory = 516;

        comp1.printInfo();
        comp2.printInfo();

        ComputerFactory factory = new ComputerFactory();
        Computer comp3 = factory.create("Amd", 128);
        Computer komp2 = factory.create("INTEL", 64);

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp3, 1024);


        System.out.println(comp3.getInfo());
        comp3.printInfo();


    }
}
