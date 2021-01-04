package com.sahin.spring_core.dependency;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LaptopTest {

    @Test
    void constructLaptop() {

        Hardware cpu = new CPU();
        Hardware mainboard = new Mainboard();

        Set<Hardware> hardwares = new HashSet<>();
        hardwares.add(cpu);
        hardwares.add(mainboard);

        Laptop laptop = new Laptop(hardwares);
        laptop.getHardwares().forEach(hardware -> System.out.println(hardware.getClass().getSimpleName()));

    }

}