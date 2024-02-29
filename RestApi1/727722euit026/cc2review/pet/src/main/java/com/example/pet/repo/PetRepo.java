package com.example.pet.repo;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pet.model.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet,Integer>{

    
    
}
