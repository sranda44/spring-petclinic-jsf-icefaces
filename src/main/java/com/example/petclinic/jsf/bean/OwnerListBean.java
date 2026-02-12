package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Owner;
import com.example.petclinic.service.ClinicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class OwnerListBean {

    private final ClinicService clinicService;
    private List<Owner> owners;

    public OwnerListBean(ClinicService clinicService) {
        this.clinicService = clinicService;
        this.owners = clinicService.findAllOwners();
    }

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }
}