package com.example.petclinic.jsf.bean;

import com.example.petclinic.domain.Visit;
import com.example.petclinic.service.ClinicService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean
@ViewScoped
public class VisitBean {

    private ClinicService clinicService;
    private List<Visit> visits;
    private Visit visit;

    public VisitBean() {
        // Initialize the clinic service and load visits
        this.clinicService = // obtain clinic service instance (e.g., via dependency injection)
        this.visits = clinicService.findAllVisits();
        this.visit = new Visit();
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String saveVisit() {
        clinicService.saveVisit(visit);
        visits = clinicService.findAllVisits(); // Refresh the list of visits
        return "visitList"; // Navigate to visit list page
    }

    public String deleteVisit(Visit visit) {
        clinicService.deleteVisit(visit);
        visits = clinicService.findAllVisits(); // Refresh the list of visits
        return null; // Stay on the same page
    }
}