package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Pet;
import com.example.petclinic.domain.PetType;
import com.example.petclinic.domain.Visit;
import com.example.petclinic.service.ClinicService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * JSF Managed Bean for pet detail and management
 * Handles pet information and associated visits
 */
public class PetDetailBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Pet pet;
    private Collection<Visit> visits = new ArrayList<Visit>();
    private Collection<PetType> petTypes = new ArrayList<PetType>();
    private ClinicService clinicService;
    private boolean editMode = false;

    public PetDetailBean() {
        initializeService();
    }

    private void initializeService() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        this.clinicService = (ClinicService) springContext.getBean("clinicService");
    }

    public void loadPetTypes() {
        try {
            this.petTypes = clinicService.findAllPetTypes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadPetDetail(Integer petId) {
        try {
            this.pet = clinicService.findPetById(petId);
            this.visits = this.pet.getVisits();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String savePet() {
        try {
            if (pet != null) {
                clinicService.savePet(pet);
                editMode = false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    public String addVisit() {
        try {
            Visit visit = new Visit();
            visit.setPet(pet);
            visit.setVisitDate(new Date());
            clinicService.saveVisit(visit);
            this.visits = pet.getVisits();
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "success";
    }

    // Getters and Setters
    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Collection<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Collection<Visit> visits) {
        this.visits = visits;
    }

    public Collection<PetType> getPetTypes() {
        return petTypes;
    }

    public void setPetTypes(Collection<PetType> petTypes) {
        this.petTypes = petTypes;
    }

    public boolean isEditMode() {
        return editMode;
    }

    public void setEditMode(boolean editMode) {
        this.editMode = editMode;
    }

    public void toggleEditMode() {
        this.editMode = !this.editMode;
    }
}