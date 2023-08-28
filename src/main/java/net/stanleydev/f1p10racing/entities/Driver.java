package net.stanleydev.f1p10racing.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.DriverPostDTO;

import java.util.Set;

@Entity(name = "Driver")
@Table(name = "tb_driver")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
    @JsonIgnore
    @OneToMany(mappedBy = "driver")
    private Set<DriverInSeason> driverInSeason;

    public Driver(DriverPostDTO driverPostDTO){
        this.name = driverPostDTO.name();
        this.team = driverPostDTO.team();
    }
}
