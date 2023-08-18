package net.stanleydev.f1p10racing.services;

import net.stanleydev.f1p10racing.dtos.TeamDTO;
import net.stanleydev.f1p10racing.dtos.TeamPostDTO;
import net.stanleydev.f1p10racing.entities.Team;
import net.stanleydev.f1p10racing.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class TeamService {
    private final TeamRepository teamRepository;

    @Autowired
    public TeamService(TeamRepository teamRepository){
        this.teamRepository = teamRepository;
    }

    public List<TeamDTO> getAllTeams(){
        return teamRepository.findAll().stream().map(TeamDTO::new).toList();
    }

    public String newTeam(TeamPostDTO teamPostDTO){
        Team team = new Team(teamPostDTO);
        teamRepository.save(team);
        return team.toString();
    }
}
