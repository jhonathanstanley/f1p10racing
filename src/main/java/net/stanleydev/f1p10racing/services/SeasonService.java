package net.stanleydev.f1p10racing.services;

import net.stanleydev.f1p10racing.dtos.SeasonDTO;
import net.stanleydev.f1p10racing.dtos.SeasonPostDTO;
import net.stanleydev.f1p10racing.entities.Season;
import net.stanleydev.f1p10racing.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeasonService {
    private final SeasonRepository seasonRepository;
    @Autowired
    public SeasonService(SeasonRepository seasonRepository){
        this.seasonRepository = seasonRepository;
    }

    public List<SeasonDTO> getAllSeasons(){
        return seasonRepository.findAll().stream().map(SeasonDTO::new).toList();
    }

    public SeasonDTO newSeason(SeasonPostDTO seasonPostDTO){
        Season season = new Season(seasonPostDTO);
        return new SeasonDTO(seasonRepository.save(season));
    }
}
