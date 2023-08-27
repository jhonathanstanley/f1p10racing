package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.entities.Team;

import java.util.Set;

public record TeamDTO(String id, String name, Set<Driver> drivers) {
    public TeamDTO(Team team) {
        this(team.getId(), team.getName(), team.getDrivers());
    }
}
