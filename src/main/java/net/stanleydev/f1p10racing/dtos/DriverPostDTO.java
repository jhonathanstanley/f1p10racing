package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.entities.Team;

public record DriverPostDTO(String name, Team team) {
    public DriverPostDTO(Driver driver){
        this(driver.getName(), driver.getTeam());
    }
}