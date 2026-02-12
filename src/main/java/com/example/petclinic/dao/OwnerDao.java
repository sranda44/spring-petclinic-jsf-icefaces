package com.example.petclinic.dao;

import com.example.petclinic.domain.Owner;

import java.util.List;

public interface OwnerDao {
    Owner findById(Long id);
    List<Owner> findAll();
    void save(Owner owner);
    void delete(Long id);
    void delete(Owner owner);
}