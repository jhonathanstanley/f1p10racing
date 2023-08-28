package net.stanleydev.f1p10racing.dtos;

import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.entities.DriverInSeason;
import net.stanleydev.f1p10racing.entities.Season;

public record DriverInSeasonDTO(String id,Driver driver, Season season, Boolean isActive) {
    public DriverInSeasonDTO(DriverInSeason driverInSeason){
        this(driverInSeason.getId(), driverInSeason.getDriver(), driverInSeason.getSeason(), driverInSeason.getIsActive());
    }
}
