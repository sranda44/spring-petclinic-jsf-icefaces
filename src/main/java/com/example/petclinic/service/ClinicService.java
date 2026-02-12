package com.example.petclinic.service;

import com.example.petclinic.dao.OwnerDao;
import com.example.petclinic.dao.PetDao;
import com.example.petclinic.dao.PetTypeDao;
import com.example.petclinic.dao.SpecialtyDao;
import com.example.petclinic.dao.VetDao;
import com.example.petclinic.dao.VisitDao;
import com.example.petclinic.domain.Owner;
import com.example.petclinic.domain.Pet;
import com.example.petclinic.domain.PetType;
import com.example.petclinic.domain.Specialty;
import com.example.petclinic.domain.Vet;
import com.example.petclinic.domain.Visit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
// @Transactional
public class ClinicService {

    private final OwnerDao ownerDao;
    private final PetDao petDao;
    private final PetTypeDao petTypeDao;
    private final SpecialtyDao specialtyDao;
    private final VetDao vetDao;
    private final VisitDao visitDao;

    @Autowired
    public ClinicService(OwnerDao ownerDao, PetDao petDao, PetTypeDao petTypeDao,
                         SpecialtyDao specialtyDao, VetDao vetDao, VisitDao visitDao) {
        this.ownerDao = ownerDao;
        this.petDao = petDao;
        this.petTypeDao = petTypeDao;
        this.specialtyDao = specialtyDao;
        this.vetDao = vetDao;
        this.visitDao = visitDao;
    }

    public List<Owner> findAllOwners() {
        return ownerDao.findAll();
    }

    public Owner findOwnerById(Long id) {
        return ownerDao.findById(id);
    }

    public void saveOwner(Owner owner) {
        ownerDao.save(owner);
    }

    public void deleteOwner(Long id) {
        ownerDao.delete(id);
    }

    public Pet findPetsByOwnerId(Long ownerId) {
        return petDao.findByOwnerId(ownerId);
    }

    public List<PetType> findAllPetTypes() {
        return petTypeDao.findAll();
    }

    public List<Specialty> findAllSpecialties() {
        return specialtyDao.findAll();
    }

    public List<Vet> findAllVets() {
        return vetDao.findAll();
    }

    public void savePet(Pet pet) {
        petDao.save(pet);
    }

    public void saveVisit(Visit visit) {
        visitDao.save(visit);
    }

    public List<Visit> findVisitsByPetId(Long petId) {
        return visitDao.findByPetId(petId);
    }
}