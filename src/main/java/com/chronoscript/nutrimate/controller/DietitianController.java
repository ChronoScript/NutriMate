package com.chronoscript.nutrimate.controller;

import com.chronoscript.nutrimate.entity.Dietitian;
import com.chronoscript.nutrimate.service.DietitianService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Annotation
@RestController
@RequestMapping("dietitian")
public class DietitianController {

    //Annotation
    @Autowired private DietitianService dietitianService;

    // Save operation
    @PostMapping("/save")
    public Dietitian saveDietitian(
            @Valid @RequestBody Dietitian dietitian)
    {
        return dietitianService.saveDietitian(dietitian);
    }

    // Read operation
    @GetMapping("/get")
    public List<Dietitian> fetchDietitianList()
    {
        return dietitianService.fetchDietitianList();
    }

    // Read by id operation
    @GetMapping("/getById/{id}")
    public Optional<Dietitian> fetchDietitianById(@PathVariable("id") Long DietitianId)
    {
        return dietitianService.fetchDietitianById(DietitianId);
    }

    // Update operation
    @PutMapping("/update/{id}")
    public Dietitian
    updateDietitian(@RequestBody Dietitian dietitian,
                   @PathVariable("id") Long DietitianId)
    {
        return dietitianService.updateDietitian(
                dietitian, DietitianId);
    }

    // Delete operation
    @DeleteMapping("/delete/{id}")
    public String deleteDietitianById(@PathVariable("id")
                                     Long DietitianId)
    {
        dietitianService.deleteDietitianById(
                DietitianId);
        return "Deleted Successfully";
    }
}
