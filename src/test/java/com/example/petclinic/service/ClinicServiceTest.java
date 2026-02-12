package com.example.petclinic.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import com.example.petclinic.dao.OwnerDao;
import com.example.petclinic.dao.PetDao;
import com.example.petclinic.dao.VetDao;
import com.example.petclinic.domain.Owner;
import com.example.petclinic.domain.Pet;
import com.example.petclinic.domain.Vet;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

public class ClinicServiceTest {

    private ClinicService clinicService;
    private OwnerDao ownerDao;
    private PetDao petDao;
    private VetDao vetDao;

    @Before
    public void setUp() {
        ownerDao = mock(OwnerDao.class);
        petDao = mock(PetDao.class);
        vetDao = mock(VetDao.class);
        clinicService = new ClinicService(ownerDao, petDao, vetDao);
    }

    @Test
    public void testFindOwnerById() {
        Owner owner = new Owner();
        owner.setId(1);
        when(ownerDao.findById(1)).thenReturn(owner);

        Owner foundOwner = clinicService.findOwnerById(1);
        assertNotNull(foundOwner);
        assertNotNull(foundOwner.getId());
    }

    @Test
    public void testFindAllPets() {
        when(petDao.findAll()).thenReturn(Collections.emptyList());

        assertNotNull(clinicService.findAllPets());
    }

    @Test
    public void testFindAllVets() {
        when(vetDao.findAll()).thenReturn(Collections.emptyList());

        assertNotNull(clinicService.findAllVets());
    }
}