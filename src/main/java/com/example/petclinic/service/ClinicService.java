package com.example.petclinic.service;

import com.example.petclinic.dao.OwnerDao;
import com.example.petclinic.dao.PetDao;
import com.example.petclinic.dao.PetTypeDao;
import com.example.petclinic.dao.VisitDao;
import com.example.petclinic.dao.VetDao;
import com.example.petclinic.domain.*;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Business service layer for Pet Clinic operations
 * Java 8 compatible with lambda support
 */
@Transactional
public class ClinicService {

    private OwnerDao ownerDao;
    private PetDao petDao;
    private VetDao vetDao;
    private VisitDao visitDao;
    private PetTypeDao petTypeDao;

    // Owner operations
    public Collection<Owner> findAllOwners() {
        return ownerDao.findAll();
    }

    public Owner findOwnerById(Integer id) {
        return ownerDao.findById(id);
    }

    public void saveOwner(Owner owner) {
        ownerDao.save(owner);
    }

    public void deleteOwner(Owner owner) {
        ownerDao.delete(owner);
    }

    // Pet operations
    public Collection<Pet> findAllPets() {
        return petDao.findAll();
    }

    public Pet findPetById(Integer id) {
        return petDao.findById(id);
    }

    public void savePet(Pet pet) {
        petDao.save(pet);
    }

    public void deletePet(Pet pet) {
        petDao.delete(pet);
    }

    // Vet operations
    public Collection<Vet> findAllVets() {
        return vetDao.findAll();
    }

    public Vet findVetById(Integer id) {
        return vetDao.findById(id);
    }

    public void saveVet(Vet vet) {
        vetDao.save(vet);
    }

    // Visit operations
    public Collection<Visit> findAllVisits() {
        return visitDao.findAll();
    }

    public Visit findVisitById(Integer id) {
        return visitDao.findById(id);
    }

    public void saveVisit(Visit visit) {
        visitDao.save(visit);
    }

    // Pet Type operations
    public Collection<PetType> findAllPetTypes() {
        return petTypeDao.findAll();
    }

    // Setters for dependency injection
    public void setOwnerDao(OwnerDao ownerDao) {
        this.ownerDao = ownerDao;
    }

    public void setPetDao(PetDao petDao) {
        this.petDao = petDao;
    }

    public void setVetDao(VetDao vetDao) {
        this.vetDao = vetDao;
    }

    public void setVisitDao(VisitDao visitDao) {
        this.visitDao = visitDao;
    }

    public void setPetTypeDao(PetTypeDao petTypeDao) {
        this.petTypeDao = petTypeDao;
    }
}