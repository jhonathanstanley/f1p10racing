package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.TeamDTO;
import net.stanleydev.f1p10racing.dtos.TeamPostDTO;
import net.stanleydev.f1p10racing.entities.Team;
import net.stanleydev.f1p10racing.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {
    private final TeamService teamService;

    public TeamController(TeamService teamService) {
        this.teamService = teamService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity getAllTeams(){
        return ResponseEntity.ok(teamService.getAllTeams());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity newTeam(@RequestBody TeamPostDTO teamPostDTO){
        return ResponseEntity.ok(teamService.newTeam(teamPostDTO));
    }

}
