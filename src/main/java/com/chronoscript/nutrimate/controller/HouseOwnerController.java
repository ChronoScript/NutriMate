package com.chronoscript.nutrimate.controller;

import com.chronoscript.nutrimate.entity.HouseOwener;
import com.chronoscript.nutrimate.service.HouseOwnerService;
import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
// Importing required classes
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController

public class HouseOwnerController {

    //Annotation
    @Autowired private HouseOwnerService houseOwnerService;

    // Save operation
    @PostMapping("/HouseOwner/Save")
    public HouseOwener saveHouseOwner(
            @Valid @RequestBody HouseOwener houseOwener)
    {
        return houseOwnerService.saveHouseOwner(houseOwener);
    }

    // Read operation
    @GetMapping("/HouseOwner/Get")
    public List<HouseOwener> fetchHouseOwenerList()
    {
        return houseOwnerService.fetchHouseOwenerList();
    }

    // Read by id operation
    @GetMapping("/HouseOwner/GetById/{id}")
    public Optional<HouseOwener> fetchHouseOwenerById(@PathVariable("id") Long HouseOwenerId)
    {
        return houseOwnerService.fetchHouseOwenerById(HouseOwenerId);
    }

    // Update operation
    @PutMapping("/HouseOwner/{id}")
    public HouseOwener
    updateHouseOwener(@RequestBody HouseOwener houseOwener,
                   @PathVariable("id") Long HouseOwenerId)
    {
        return houseOwnerService.updateHouseOwener(
                houseOwener, HouseOwenerId);
    }

    // Delete operation
    @DeleteMapping("/HouseOwner/{id}")
    public String deleteHouseOwenerById(@PathVariable("id")
                                     Long HouseOwenerId)
    {
        houseOwnerService.deleteHouseOwenerById(
                HouseOwenerId);
        return "Deleted Successfully";
    }
}
