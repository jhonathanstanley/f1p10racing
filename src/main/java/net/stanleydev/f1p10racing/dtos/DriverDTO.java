package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.entities.Team;

public record DriverDTO(String id, String name, Team team) {
    public DriverDTO(Driver driver){
        this(driver.getId(), driver.getName(), driver.getTeam());
    }
}
