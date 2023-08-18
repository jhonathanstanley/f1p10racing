package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Circuit;

public record CircuitPostDTO(String name, String country) {
    public CircuitPostDTO(Circuit circuit){
        this(circuit.getName(), circuit.getCountry());
    }
}
