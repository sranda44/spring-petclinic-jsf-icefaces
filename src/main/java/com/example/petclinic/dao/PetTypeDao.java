package com.example.petclinic.dao;

import com.example.petclinic.domain.PetType;
import java.util.List;

public interface PetTypeDao {
    List<PetType> findAll();
    PetType findById(Long id);
    void save(PetType petType);
    void delete(Long id);
    void delete(PetType petType);
}