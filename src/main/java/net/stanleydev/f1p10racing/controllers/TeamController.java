package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.TeamDTO;
import net.stanleydev.f1p10racing.dtos.TeamPostDTO;
import net.stanleydev.f1p10racing.entities.Team;
import net.stanleydev.f1p10racing.services.TeamService;
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
    public List<TeamDTO> getAllTeams(){
        return teamService.getAllTeams();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public String newTeam(@RequestBody TeamPostDTO teamPostDTO){
        return teamService.newTeam(teamPostDTO);
    }

}
