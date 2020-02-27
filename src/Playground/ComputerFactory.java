package Playground;

public class ComputerFactory {
    Computer create (String procesor, int memory){
        Computer computer = new Computer();
        computer.processor = procesor;
        computer.memory = memory;
        return computer;
    }
}
