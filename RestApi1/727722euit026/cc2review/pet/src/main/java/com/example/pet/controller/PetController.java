package com.example.pet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.pet.model.Pet;
import com.example.pet.service.PetService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class PetController {
    @Autowired
    PetService petService;

    @PostMapping("/add")
    public Pet add(@RequestBody Pet pet){
        return petService.add(pet);
    }
    
    @GetMapping("/get")
    public List<Pet> get()
    {
        return petService.get();
    }

    @GetMapping("/get/sort/{field}")
    public List<Pet> getMethod(@PathVariable String field) {
        return petService.getSort(field);
    }

    @GetMapping("/get/{pageNo}/{pageSize}")
    public List<Pet> getMet(@PathVariable int pageNo,@PathVariable int pageSize) {
        return petService.page(pageNo, pageSize);
    }
    
    
    
    

    
}
