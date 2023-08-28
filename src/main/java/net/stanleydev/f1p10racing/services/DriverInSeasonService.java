package net.stanleydev.f1p10racing.services;

import net.stanleydev.f1p10racing.dtos.DriverInSeasonDTO;
import net.stanleydev.f1p10racing.dtos.DriverInSeasonPostDTO;
import net.stanleydev.f1p10racing.entities.DriverInSeason;
import net.stanleydev.f1p10racing.repositories.DriverInSeasonRepository;
import net.stanleydev.f1p10racing.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverInSeasonService {
    private final DriverInSeasonRepository repository;

    @Autowired
    public DriverInSeasonService(DriverInSeasonRepository repository){
        this.repository = repository;
    }

    public DriverInSeasonDTO insertDriverInSeason(DriverInSeasonPostDTO driverInSeasonPostDTO){
        DriverInSeason driverInSeason = new DriverInSeason(driverInSeasonPostDTO);
        return new DriverInSeasonDTO(repository.save(driverInSeason));
    }

    public List<DriverInSeasonDTO> getAllDriversInSeason(){
        return repository.findAll().stream().map(DriverInSeasonDTO::new).toList();
    }

    public List<DriverInSeasonDTO> getDriversInCurrentSeason(){
        return repository.findByActivatedSeason().stream().map(DriverInSeasonDTO::new).toList();
    }
}
