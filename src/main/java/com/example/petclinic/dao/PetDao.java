package com.example.petclinic.dao;

import com.example.petclinic.domain.Pet;
import java.util.List;

public interface PetDao {
    Pet findByOwnerId(Long id);
    List<Pet> findAll();
    void save(Pet pet);
    void delete(Pet pet);
}