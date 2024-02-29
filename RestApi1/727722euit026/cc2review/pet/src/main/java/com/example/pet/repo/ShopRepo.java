package com.example.pet.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pet.model.Shop;

@Repository
public interface ShopRepo extends JpaRepository<Shop,Integer>{
    
}
