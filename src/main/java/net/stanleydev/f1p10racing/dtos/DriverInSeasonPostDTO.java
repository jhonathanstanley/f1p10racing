package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.entities.DriverInSeason;
import net.stanleydev.f1p10racing.entities.Season;

public record DriverInSeasonPostDTO(Driver driver, Season season, Boolean isActive) {
    public DriverInSeasonPostDTO(DriverInSeason driverInSeason){
        this(driverInSeason.getDriver(), driverInSeason.getSeason(), driverInSeason.getIsActive());
    }
}