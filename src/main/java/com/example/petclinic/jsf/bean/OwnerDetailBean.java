package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Owner;
import com.example.petclinic.service.ClinicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class OwnerDetailBean {

    @Inject
    private ClinicService clinicService;

    private Owner owner;

    public void loadOwner(Long ownerId) {
        if (ownerId != null) {
            owner = clinicService.findOwnerById(ownerId);
        }
    }

    public String saveOwner() {
        clinicService.saveOwner(owner);
        return "ownerList?faces-redirect=true";
    }

    public String deleteOwner() {
        clinicService.deleteOwner(owner.getId());
        return "ownerList?faces-redirect=true";
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}