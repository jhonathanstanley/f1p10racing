package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Season;

public record SeasonDTO(String id, Long season, Boolean isActive) {

    public SeasonDTO(Season season){
        this(season.getId(), season.getSeason(), season.getIsActive());
    }
}
