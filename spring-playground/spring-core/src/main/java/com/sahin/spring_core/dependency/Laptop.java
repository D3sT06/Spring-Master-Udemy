package com.sahin.spring_core.dependency;

import java.util.Set;

// Dependency inversion: High-Level modules should not depend on low-level modules. Instead, both should depend on abstractions
public class Laptop {

    private Set<Hardware> hardwares;

    public Set<Hardware> getHardwares() {
        return hardwares;
    }

    public Laptop(Set<Hardware> hardwares) {
        this.hardwares = hardwares;
    }
}