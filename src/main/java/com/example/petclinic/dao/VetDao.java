package com.example.petclinic.dao;

import com.example.petclinic.domain.Vet;
import java.util.List;

public interface VetDao {
    Vet findById(Long id);
    List<Vet> findAll();
    void save(Vet vet);
    void delete(Long id);
    void delete(Vet vet);
}