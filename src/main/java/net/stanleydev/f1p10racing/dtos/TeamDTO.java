package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Team;

public record TeamDTO(String id, String name) {
    public TeamDTO(Team team) {
        this(team.getId(), team.getName());
    }
}
