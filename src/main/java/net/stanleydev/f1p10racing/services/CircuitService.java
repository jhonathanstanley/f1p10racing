package net.stanleydev.f1p10racing.services;

import net.stanleydev.f1p10racing.dtos.CircuitDTO;
import net.stanleydev.f1p10racing.dtos.CircuitPostDTO;
import net.stanleydev.f1p10racing.entities.Circuit;
import net.stanleydev.f1p10racing.repositories.CircuitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CircuitService {
    private final CircuitRepository circuitRepository;
    @Autowired
    CircuitService(CircuitRepository circuitRepository){
        this.circuitRepository = circuitRepository;
    }

    public List<CircuitDTO> getAllCircuits(){
        return circuitRepository.findAll().stream().map(CircuitDTO::new).toList();
    }

    public String newCircuit(CircuitPostDTO circuitDTO){
        Circuit circuit = new Circuit(circuitDTO);
        circuitRepository.save(circuit);
        return circuit.toString();
    }
}
