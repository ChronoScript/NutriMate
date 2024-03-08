package com.chronoscript.nutrimate.repository;

// Importing required classes
import com.chronoscript.nutrimate.entity.HouseOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Annotation
@Repository

public interface HouseOwnerRepository  extends JpaRepository<HouseOwner, Long> {

}
