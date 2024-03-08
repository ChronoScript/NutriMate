package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.HouseOwener;
import java.util.List;
import java.util.Optional;

public interface HouseOwnerService {
    //Save operation
    HouseOwener saveHouseOwner(HouseOwener houseOwener);

    // Read operation
    List<HouseOwener> fetchHouseOwenerList();

    // Read by id operation
    Optional<HouseOwener> fetchHouseOwenerById(Long houseOwenerId);

    // Update operation
    HouseOwener updateHouseOwener(HouseOwener houseOwener,
                            Long houseOwenerId);

    // Delete operation
    void deleteHouseOwenerById(Long houseOwenerId);
}
