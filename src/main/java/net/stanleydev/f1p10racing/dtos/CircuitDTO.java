package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Circuit;

public record CircuitDTO(String id, String name, String country) {
    public CircuitDTO(Circuit circuit){
        this(circuit.getId(), circuit.getName(), circuit.getCountry());
    }
}
