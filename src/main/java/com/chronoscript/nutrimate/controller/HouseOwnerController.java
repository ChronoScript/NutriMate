package com.chronoscript.nutrimate.controller;

import com.chronoscript.nutrimate.entity.HouseOwner;
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
    public HouseOwner saveHouseOwner(
            @Valid @RequestBody HouseOwner houseOwener)
    {
        return houseOwnerService.saveHouseOwner(houseOwener);
    }

    // Read operation
    @GetMapping("/HouseOwner/Get")
    public List<HouseOwner> fetchHouseOwnerList()
    {
        return houseOwnerService.fetchHouseOwnerList();
    }

    // Read by id operation
    @GetMapping("/HouseOwner/GetById/{id}")
    public Optional<HouseOwner> fetchHouseOwnerById(@PathVariable("id") Long HouseOwenerId)
    {
        return houseOwnerService.fetchHouseOwnerById(HouseOwenerId);
    }

    // Update operation
    @PutMapping("/HouseOwner/{id}")
    public HouseOwner
    updateHouseOwner(@RequestBody HouseOwner houseOwener,
                   @PathVariable("id") Long HouseOwnerId)
    {
        return houseOwnerService.updateHouseOwner(
                houseOwener, HouseOwnerId);
    }

    // Delete operation
    @DeleteMapping("/HouseOwner/{id}")
    public String deleteHouseOwnerById(@PathVariable("id")
                                     Long HouseOwnerId)
    {
        houseOwnerService.deleteHouseOwnerById(
                HouseOwnerId);
        return "Deleted Successfully";
    }
}
