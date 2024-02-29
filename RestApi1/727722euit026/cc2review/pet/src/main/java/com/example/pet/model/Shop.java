package com.example.pet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int petId;

    String petBreed;
    String petAge;
    public int getPetId() {
        return petId;
    }
    public void setPetId(int petId) {
        this.petId = petId;
    }
    public String getPetBreed() {
        return petBreed;
    }
    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }
    public String getPetAge() {
        return petAge;
    }
    public void setPetAge(String petAge) {
        this.petAge = petAge;
    }

    
}
