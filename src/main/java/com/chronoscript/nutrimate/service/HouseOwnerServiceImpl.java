package com.chronoscript.nutrimate.service;

import com.chronoscript.nutrimate.entity.HouseOwener;
import com.chronoscript.nutrimate.repository.HouseOwnerRepository;
// Importing required classes
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class HouseOwnerServiceImpl
        implements HouseOwnerService {

    @Autowired
    private HouseOwnerRepository houseOwnerRepository;

    // Save operation
    @Override
    public HouseOwener saveHouseOwner(HouseOwener houseOwener)
    {
        return houseOwnerRepository.save(houseOwener);
    }

    // Read operation
    @Override
    public List<HouseOwener> fetchHouseOwenerList()
    {
        return (List<HouseOwener>)
                houseOwnerRepository.findAll();
    }

    // Read by id operation
    @Override public Optional<HouseOwener> fetchHouseOwenerById(Long houseOwenerId)
    {
        return houseOwnerRepository.findById(houseOwenerId);
    }

    // Update operation
    @Override
    public HouseOwener
    updateHouseOwener(HouseOwener houseOwener,
                      Long houseOwenerId)
    {
        HouseOwener depDB
                = houseOwnerRepository.findById(houseOwenerId)
                .get();

        if (Objects.nonNull(houseOwener.getFirstName())
                && !"".equalsIgnoreCase(
                houseOwener.getFirstName())) {
            depDB.setFirstName(
                    houseOwener.getFirstName());
        }

        if (Objects.nonNull(houseOwener.getLastName())
                && !"".equalsIgnoreCase(
                houseOwener.getLastName())) {
            depDB.setLastName(
                    houseOwener.getLastName());
        }

        if (Objects.nonNull(houseOwener.getDOB())
                && !"".equalsIgnoreCase(
                houseOwener.getDOB())) {
            depDB.setLastName(
                    houseOwener.getLastName());
        }

        if (Objects.nonNull(houseOwener.getGender())
                && !"".equalsIgnoreCase(
                houseOwener.getGender())) {
            depDB.setGender(
                    houseOwener.getGender());
        }

        if (Objects.nonNull(houseOwener.getWeight())
                && !"".equalsIgnoreCase(
                houseOwener.getWeight())) {
            depDB.setWeight(
                    houseOwener.getWeight());
        }

        if (Objects.nonNull(houseOwener.getHeight())
                && !"".equalsIgnoreCase(
                houseOwener.getHeight())) {
            depDB.setHeight(
                    houseOwener.getHeight());
        }

        if (Objects.nonNull(houseOwener.getIlnesses())
                && !"".equalsIgnoreCase(
                houseOwener.getIlnesses())) {
            depDB.setIlnesses(
                    houseOwener.getIlnesses());
        }

        if (Objects.nonNull(houseOwener.getCurrentMedicine())
                && !"".equalsIgnoreCase(
                houseOwener.getCurrentMedicine())) {
            depDB.setCurrentMedicine(
                    houseOwener.getCurrentMedicine());
        }

        if (Objects.nonNull(houseOwener.getAllergies())
                && !"".equalsIgnoreCase(
                houseOwener.getAllergies())) {
            depDB.setAllergies(
                    houseOwener.getAllergies());
        }

        if (Objects.nonNull(houseOwener.getDietaryPreferences())
                && !"".equalsIgnoreCase(
                houseOwener.getDietaryPreferences())) {
            depDB.setDietaryPreferences(
                    houseOwener.getDietaryPreferences());
        }


        return houseOwnerRepository.save(depDB);
    }

    // Delete operation
    @Override
    public void deleteHouseOwenerById(Long employeeId)
    {
        houseOwnerRepository.deleteById(employeeId);
    }

}
