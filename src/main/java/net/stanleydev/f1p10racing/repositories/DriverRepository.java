package net.stanleydev.f1p10racing.repositories;

import net.stanleydev.f1p10racing.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, String> {
}
