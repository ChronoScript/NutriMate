package com.chronoscript.nutrimate.service.impl;

import com.chronoscript.nutrimate.entity.Dietitian;
import com.chronoscript.nutrimate.repository.DietitianRepository;
import com.chronoscript.nutrimate.service.DietitianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service

public  class DietitianServiceImpl implements DietitianService {

    @Autowired
    private DietitianRepository DietitianRepository;

    // Save operation
    @Override
    public Dietitian saveDietitian(Dietitian dietitian)
    {
        return DietitianRepository.save(dietitian);
    }

    // Read operation
    @Override
    public List<Dietitian> fetchDietitianList()
    {
        return (List<Dietitian>)
                DietitianRepository.findAll();
    }

    // Read by id operation
    @Override public Optional<Dietitian> fetchDietitianById(Long dietitianId)
    {
        return DietitianRepository.findById(dietitianId);
    }

    // Update operation
    @Override
    public Dietitian
    updateDietitian(Dietitian dietitian,
                      Long dietitianId)
    {
        Dietitian upDB
                = DietitianRepository.findById(dietitianId)
                .get();

        if (Objects.nonNull(dietitian.getFirstName())
                && !"".equalsIgnoreCase(
                dietitian.getFirstName())) {
            upDB.setFirstName(
                    dietitian.getFirstName());
        }

        if (Objects.nonNull(dietitian.getLastName())
                && !"".equalsIgnoreCase(
                dietitian.getLastName())) {
            upDB.setLastName(
                    dietitian.getLastName());
        }

        if (Objects.nonNull(dietitian.getOccupation())
                && !"".equalsIgnoreCase(
                dietitian.getOccupation())) {
            upDB.setOccupation(
                    dietitian.getOccupation());
        }

        if (Objects.nonNull(dietitian.getContact_no())
                && !"".equalsIgnoreCase(
                dietitian.getContact_no())) {
            upDB.setContact_no(
                    dietitian.getContact_no());
        }

        if (Objects.nonNull(dietitian.getBio())
                && !"".equalsIgnoreCase(
                dietitian.getBio())) {
            upDB.setBio(
                    dietitian.getBio());
        }

        if (Objects.nonNull(dietitian.getEmployer_name())
                && !"".equalsIgnoreCase(
                dietitian.getEmployer_name())) {
            upDB.setEmployer_name(
                    dietitian.getEmployer_name());
        }

        if (Objects.nonNull(dietitian.getEmployment_duration())
                && !"".equalsIgnoreCase(
                dietitian.getEmployment_duration())) {
            upDB.setEmployment_duration(
                    dietitian.getEmployment_duration());
        }

        if (Objects.nonNull(dietitian.getResponsibilities())
                && !"".equalsIgnoreCase(
                dietitian.getResponsibilities())) {
            upDB.setResponsibilities(
                    dietitian.getResponsibilities());
        }

        if (Objects.nonNull(dietitian.getDegree())
                && !"".equalsIgnoreCase(
                dietitian.getDegree())) {
            upDB.setDegree(
                    dietitian.getDegree());
        }

        if (Objects.nonNull(dietitian.getInstitution())
                && !"".equalsIgnoreCase(
                dietitian.getInstitution())) {
            upDB.setInstitution(
                    dietitian.getInstitution());
        }


        return DietitianRepository.save(upDB);
    }

    // Delete operation
    @Override
    public void deleteDietitianById(Long dietitianId)
    {
        DietitianRepository.deleteById(dietitianId);
    }

}
