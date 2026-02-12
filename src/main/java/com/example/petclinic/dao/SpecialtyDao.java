package com.example.petclinic.dao;

import com.example.petclinic.domain.Specialty;
import java.util.List;

public interface SpecialtyDao {
    Specialty findById(Long id);
    List<Specialty> findAll();
    void save(Specialty specialty);
    void delete(Specialty specialty);
}