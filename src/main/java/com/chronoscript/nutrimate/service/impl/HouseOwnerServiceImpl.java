package com.chronoscript.nutrimate.service.impl;

import com.chronoscript.nutrimate.entity.HouseOwner;
import com.chronoscript.nutrimate.repository.HouseOwnerRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.chronoscript.nutrimate.service.HouseOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HouseOwnerServiceImpl
        implements HouseOwnerService {

    @Autowired
    private HouseOwnerRepository houseOwnerRepository;

    // Save operation
    @Override
    public HouseOwner saveHouseOwner(HouseOwner houseOwner)
    {
        return houseOwnerRepository.save(houseOwner);
    }

    // Read operation
    @Override
    public List<HouseOwner> fetchHouseOwnerList()
    {
        return (List<HouseOwner>)
                houseOwnerRepository.findAll();
    }

    // Read by id operation
    @Override public Optional<HouseOwner> fetchHouseOwnerById(Long houseOwnerId)
    {
        return houseOwnerRepository.findById(houseOwnerId);
    }

    // Update operation
    @Override
    public HouseOwner
    updateHouseOwner(HouseOwner houseOwner,
                      Long houseOwnerId)
    {
        HouseOwner depDB
                = houseOwnerRepository.findById(houseOwnerId)
                .get();

        if (Objects.nonNull(houseOwner.getFirstName())
                && !"".equalsIgnoreCase(
                houseOwner.getFirstName())) {
            depDB.setFirstName(
                    houseOwner.getFirstName());
        }

        if (Objects.nonNull(houseOwner.getLastName())
                && !"".equalsIgnoreCase(
                houseOwner.getLastName())) {
            depDB.setLastName(
                    houseOwner.getLastName());
        }

        if (Objects.nonNull(houseOwner.getDob())
                && !"".equalsIgnoreCase(
                houseOwner.getDob())) {
            depDB.setDob(
                    houseOwner.getDob());
        }

        if (Objects.nonNull(houseOwner.getGender())
                && !"".equalsIgnoreCase(
                houseOwner.getGender())) {
            depDB.setGender(
                    houseOwner.getGender());
        }

        if (Objects.nonNull(houseOwner.getWeight())
                && !"".equalsIgnoreCase(
                houseOwner.getWeight())) {
            depDB.setWeight(
                    houseOwner.getWeight());
        }

        if (Objects.nonNull(houseOwner.getHeight())
                && !"".equalsIgnoreCase(
                houseOwner.getHeight())) {
            depDB.setHeight(
                    houseOwner.getHeight());
        }

        if (Objects.nonNull(houseOwner.getIllnesses())
                && !"".equalsIgnoreCase(
                houseOwner.getIllnesses())) {
            depDB.setIllnesses(
                    houseOwner.getIllnesses());
        }

        if (Objects.nonNull(houseOwner.getCurrentMedicine())
                && !"".equalsIgnoreCase(
                houseOwner.getCurrentMedicine())) {
            depDB.setCurrentMedicine(
                    houseOwner.getCurrentMedicine());
        }

        if (Objects.nonNull(houseOwner.getAllergies())
                && !"".equalsIgnoreCase(
                houseOwner.getAllergies())) {
            depDB.setAllergies(
                    houseOwner.getAllergies());
        }

        if (Objects.nonNull(houseOwner.getDietaryPreferences())
                && !"".equalsIgnoreCase(
                houseOwner.getDietaryPreferences())) {
            depDB.setDietaryPreferences(
                    houseOwner.getDietaryPreferences());
        }


        return houseOwnerRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteHouseOwnerById(Long employeeId)
    {
        houseOwnerRepository.deleteById(employeeId);
    }

}
