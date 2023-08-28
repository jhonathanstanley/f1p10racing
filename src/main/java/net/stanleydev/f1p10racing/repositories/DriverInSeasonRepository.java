package net.stanleydev.f1p10racing.repositories;

import net.stanleydev.f1p10racing.entities.DriverInSeason;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DriverInSeasonRepository extends JpaRepository<DriverInSeason, String> {

    @Query("select d from DriverInSeason d where d.season.isActive = true")
    List<DriverInSeason> findByActivatedSeason();
}
