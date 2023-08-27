package net.stanleydev.f1p10racing.controllers;

import net.stanleydev.f1p10racing.dtos.DriverDTO;
import net.stanleydev.f1p10racing.dtos.DriverPostDTO;
import net.stanleydev.f1p10racing.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class DriverController {
    private final DriverService driverService;
    @Autowired
    public DriverController(DriverService driverService){
        this.driverService = driverService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public ResponseEntity<DriverDTO> insertDriver(@RequestBody DriverPostDTO driverPostDTO){
        return ResponseEntity.ok(driverService.insertDriver(driverPostDTO));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity<List<DriverDTO>> getAllDriver(){
        return ResponseEntity.ok(driverService.getAllDrivers());
    }
}
