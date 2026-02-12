package com.example.petclinic.dao;

import com.example.petclinic.domain.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class OwnerDaoTest {

    private OwnerDao ownerDao;

    @BeforeEach
    public void setUp() {
        ownerDao = Mockito.mock(OwnerDao.class);
    }

    @Test
    public void testFindById() {
        Owner owner = new Owner();
        owner.setId(1L);
        owner.setFirstName("John");
        owner.setLastName("Doe");

        Mockito.when(ownerDao.findById(1L)).thenReturn(owner);

        Owner foundOwner = ownerDao.findById(1L);
        assertNotNull(foundOwner);
        assertEquals("John", foundOwner.getFirstName());
        assertEquals("Doe", foundOwner.getLastName());
    }

    @Test
    public void testSave() {
        Owner owner = new Owner();
        owner.setId(2L);
        owner.setFirstName("Jane");
        owner.setLastName("Smith");

        Mockito.when(ownerDao.save(owner)).thenReturn(owner);

        Owner savedOwner = ownerDao.save(owner);
        assertNotNull(savedOwner);
        assertEquals("Jane", savedOwner.getFirstName());
        assertEquals("Smith", savedOwner.getLastName());
    }

    @Test
    public void testDelete() {
        Owner owner = new Owner();
        owner.setId(3L);

        ownerDao.delete(owner);
        Mockito.verify(ownerDao, Mockito.times(1)).delete(owner);
    }
}