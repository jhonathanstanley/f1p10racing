package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.SeasonDTO;
import net.stanleydev.f1p10racing.dtos.SeasonPostDTO;
import net.stanleydev.f1p10racing.services.SeasonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/season")
public class SeasonController {
    private final SeasonService seasonService;
    public SeasonController(SeasonService seasonService){
        this.seasonService = seasonService;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<SeasonDTO>> getAllSeasons(){
        return ResponseEntity.ok(seasonService.getAllSeasons());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<SeasonDTO> insertSeason(@RequestBody SeasonPostDTO seasonPostDTO){
        return ResponseEntity.ok(seasonService.newSeason(seasonPostDTO));

    }
}
