package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Pet;
import com.example.petclinic.service.ClinicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class PetDetailBean {

    @Inject
    private ClinicService clinicService;

    private Pet pet;

    public void loadPet(Integer petId) {
        if (petId != null) {
            pet = clinicService.findPetById(petId);
        }
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String save() {
        clinicService.savePet(pet);
        return "petDetail?faces-redirect=true&petId=" + pet.getId();
    }

    public String delete() {
        clinicService.deletePet(pet.getId());
        return "petList?faces-redirect=true";
    }
}