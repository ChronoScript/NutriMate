package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.Dietitian;
import java.util.List;
import java.util.Optional;

public interface DietitianService {
    //Save operation
    Dietitian saveDietitian(Dietitian dietitian);

    // Read operation
    List<Dietitian> fetchDietitianList();

    // Read by id operation
    Optional<Dietitian> fetchDietitianById(Long dietitianId);

    // Update operation
    Dietitian updateDietitian(Dietitian dietitian,
                                Long dietitianId);

    // Delete operation
    void deleteDietitianById(Long dietitianId);
}
