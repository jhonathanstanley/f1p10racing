package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.DriverInSeasonDTO;
import net.stanleydev.f1p10racing.dtos.DriverInSeasonPostDTO;
import net.stanleydev.f1p10racing.services.DriverInSeasonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver-in-season")
public class DriverInSeasonController {
    private final DriverInSeasonService service;
    public DriverInSeasonController(DriverInSeasonService service){
        this.service = service;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<DriverInSeasonDTO>> getAllDriverInSeason(){
        return ResponseEntity.ok(service.getAllDriversInSeason());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<DriverInSeasonDTO> insertDriverInSeason(@RequestBody DriverInSeasonPostDTO driverInSeasonPostDTO){
        return ResponseEntity.ok(service.insertDriverInSeason(driverInSeasonPostDTO));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    @RequestMapping("/current-season")
    public ResponseEntity<List<DriverInSeasonDTO>> getAllDriversInCurrentSeason(){
        return ResponseEntity.ok(service.getDriversInCurrentSeason());
    }
}
