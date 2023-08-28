package net.stanleydev.f1p10racing.entities;

import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.DriverInSeasonPostDTO;

@Entity(name = "DriverInSeason")
@Table(name = "tb_driver_in_season")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
public class DriverInSeason {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "season_id", nullable = false)
    private Season season;
    private Boolean isActive;

    public DriverInSeason(DriverInSeasonPostDTO driverInSeasonPostDTO) {
        this.driver = driverInSeasonPostDTO.driver();
        this.season = driverInSeasonPostDTO.season();
        this.isActive = driverInSeasonPostDTO.isActive();
    }
}
