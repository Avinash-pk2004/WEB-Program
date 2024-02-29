package com.example.pet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.pet.model.Pet;
import com.example.pet.repo.PetRepo;

@Service
public class PetService {
    @Autowired
    PetRepo petRepo;

    @SuppressWarnings("null")
    public Pet add(Pet pet)
    {
        return petRepo.save(pet);
    }

    public List<Pet> get()
    {
        return petRepo.findAll();
    }
    public List<Pet> getSort(String field)
    {
        return petRepo.findAll(Sort.by(Sort.Direction.ASC,field));
    }
    public List<Pet> page(int pageNo,int pageSize)
    {
        PageRequest page=PageRequest.of(pageNo, pageSize);
        return petRepo.findAll(page).getContent();
    }
    
    
}
