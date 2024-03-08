package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.HouseOwner;
import java.util.List;
import java.util.Optional;

public interface HouseOwnerService {
    //Save operation
    HouseOwner saveHouseOwner(HouseOwner houseOwener);

    // Read operation
    List<HouseOwner> fetchHouseOwnerList();

    // Read by id operation
    Optional<HouseOwner> fetchHouseOwnerById(Long houseOwenerId);

    // Update operation
    HouseOwner updateHouseOwner(HouseOwner houseOwener,
                                Long houseOwenerId);

    // Delete operation
    void deleteHouseOwnerById(Long houseOwenerId);
}
