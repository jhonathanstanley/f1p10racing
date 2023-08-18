package net.stanleydev.f1p10racing.entities;

import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.TeamDTO;
import net.stanleydev.f1p10racing.dtos.TeamPostDTO;

@Entity(name = "Team")
@Table(name = "tb_team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;

    public Team(TeamDTO teamDTO) {
        this.id = teamDTO.id();
        this.name = teamDTO.name();
    }

    public Team(TeamPostDTO teamPostDTO) {
        this.name = teamPostDTO.name();
    }
}
