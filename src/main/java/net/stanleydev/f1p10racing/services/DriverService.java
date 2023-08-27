package net.stanleydev.f1p10racing.services;

import net.stanleydev.f1p10racing.dtos.DriverDTO;
import net.stanleydev.f1p10racing.dtos.DriverPostDTO;
import net.stanleydev.f1p10racing.entities.Driver;
import net.stanleydev.f1p10racing.repositories.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    private final DriverRepository driverRepository;

    @Autowired
    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public List<DriverDTO> getAllDrivers(){
        return driverRepository.findAll().stream().map(DriverDTO::new).toList();
    }
    public DriverDTO insertDriver(DriverPostDTO driverPostDTO){
        Driver driver = new Driver(driverPostDTO);
        driverRepository.save(driver);
        return new DriverDTO(driver);
    }

}
