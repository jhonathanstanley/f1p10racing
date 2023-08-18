package net.stanleydev.f1p10racing.repositories;

import net.stanleydev.f1p10racing.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {
}
