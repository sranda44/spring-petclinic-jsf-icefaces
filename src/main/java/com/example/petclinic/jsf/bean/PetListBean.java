package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Pet;
import com.example.petclinic.service.ClinicService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * JSF Managed Bean for displaying list of pets
 * Backing bean for pet list view with ICEfaces integration
 */
public class PetListBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Collection<Pet> pets = new ArrayList<Pet>();
    private Pet selectedPet;
    private ClinicService clinicService;

    public PetListBean() {
        initializeService();
        loadPets();
    }

    /**
     * Initialize the clinic service from Spring context
     */
    private void initializeService() {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ServletContext servletContext = (ServletContext) facesContext.getExternalContext().getContext();
        WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        this.clinicService = (ClinicService) springContext.getBean("clinicService");
    }

    /**
     * Load all pets from database
     */
    public void loadPets() {
        try {
            this.pets = clinicService.findAllPets();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Delete selected pet
     */
    public String deletePet() {
        try {
            if (selectedPet != null) {
                clinicService.deletePet(selectedPet);
                loadPets();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "listPets";
    }

    /**
     * Navigate to pet detail view
     */
    public String viewPetDetail() {
        return "viewDetail";
    }

    /**
     * Navigate to new pet view
     */
    public String addNewPet() {
        return "addNew";
    }

    // Getters and Setters
    public Collection<Pet> getPets() {
        return pets;
    }

    public void setPets(Collection<Pet> pets) {
        this.pets = pets;
    }

    public Pet getSelectedPet() {
        return selectedPet;
    }

    public void setSelectedPet(Pet selectedPet) {
        this.selectedPet = selectedPet;
    }

    public ClinicService getClinicService() {
        return clinicService;
    }

    public void setClinicService(ClinicService clinicService) {
        this.clinicService = clinicService;
    }
}