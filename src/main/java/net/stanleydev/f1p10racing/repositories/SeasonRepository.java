package net.stanleydev.f1p10racing.repositories;

import net.stanleydev.f1p10racing.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, String> {
}
