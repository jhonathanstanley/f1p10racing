package net.stanleydev.f1p10racing.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.TeamDTO;
import net.stanleydev.f1p10racing.dtos.TeamPostDTO;

import java.util.Set;

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
    @JsonIgnore
    @OneToMany(mappedBy = "team")
    private Set<Driver> drivers;

    public Team(TeamPostDTO teamPostDTO) {
        this.name = teamPostDTO.name();
    }
}
