package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Team;

public record TeamPostDTO(String name) {
    public TeamPostDTO(Team team) {
        this(team.getName());
    }
}
