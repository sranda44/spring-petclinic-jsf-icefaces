package com.example.petclinic.dao;

import com.example.petclinic.domain.Visit;

import java.util.List;

public interface VisitDao {
    Visit findById(Long id);
    void save(Visit visit);
    void delete(Visit visit);
    List<Visit> findAll();
    List<Visit> findByPetId(Long petId);
}