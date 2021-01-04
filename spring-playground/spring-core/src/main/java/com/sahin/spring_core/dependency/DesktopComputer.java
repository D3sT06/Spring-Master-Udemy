package com.sahin.spring_core.dependency;

public class DesktopComputer {

    private CPU cpu;
    private Mainboard mainboard;

    // With dependency injection, dependencies are provided in constructor
    public DesktopComputer(CPU cpu, Mainboard mainboard) {
        this.cpu = cpu;
        this.mainboard = mainboard;
    }

    // Without dependency injection, the class is responsible of providing its own dependencies
    public DesktopComputer() {
        this.cpu = new CPU();
        this.mainboard = new Mainboard();
    }
}
