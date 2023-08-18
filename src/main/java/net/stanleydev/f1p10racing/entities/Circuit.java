package net.stanleydev.f1p10racing.entities;

import jakarta.persistence.*;
import lombok.*;
import net.stanleydev.f1p10racing.dtos.CircuitDTO;
import net.stanleydev.f1p10racing.dtos.CircuitPostDTO;

@Entity(name = "Circuit")
@Table(name = "tb_circuit")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString

public class Circuit {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    private String country;

    public Circuit(CircuitPostDTO circuitDTO){
        this.name = circuitDTO.name();
        this.country = circuitDTO.country();
    }

}