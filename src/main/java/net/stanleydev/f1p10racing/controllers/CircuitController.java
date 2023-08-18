package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.CircuitDTO;
import net.stanleydev.f1p10racing.dtos.CircuitPostDTO;
import net.stanleydev.f1p10racing.services.CircuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/circuit")
public class CircuitController {
    private final CircuitService circuitService;
    @Autowired
    public CircuitController(CircuitService circuitService){
        this.circuitService = circuitService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CircuitDTO> getAllCircuits(){
        return circuitService.getAllCircuits();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public String newCircuit(@RequestBody CircuitPostDTO circuitPostDTO){
        return circuitService.newCircuit(circuitPostDTO);
    }
}
