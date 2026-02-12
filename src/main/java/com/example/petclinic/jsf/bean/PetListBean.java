package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Pet;
import com.example.petclinic.service.ClinicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class PetListBean {

    private final ClinicService clinicService;
    private List<Pet> pets;

    public PetListBean(ClinicService clinicService) {
        this.clinicService = clinicService;
        loadPets();
    }

    public List<Pet> getPets() {
        return pets;
    }

    private void loadPets() {
        this.pets = clinicService.findAllPets();
    }
}