package net.stanleydev.f1p10racing.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.SeasonPostDTO;

import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Season")
@Table(name = "tb_season")
public class Season {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private Long season;
    private Boolean isActive;
    @JsonIgnore
    @OneToMany(mappedBy = "season")
    private Set<DriverInSeason> driverInSeasons;

    public Season(SeasonPostDTO seasonPostDTO) {
        this.season = seasonPostDTO.season();
        this.isActive = seasonPostDTO.isActive();
    }
}
