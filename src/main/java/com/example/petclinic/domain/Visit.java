package com.example.petclinic.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Domain class for Visit - Java 8 compatible
 * Uses LocalDateTime for visit date/time tracking
 */
public class Visit implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private Pet pet;
    private LocalDateTime visitDate;
    private String description;
    private LocalDateTime createdAt;

    public Visit() {
        this.createdAt = LocalDateTime.now();
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public LocalDateTime getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDateTime visitDate) {
        this.visitDate = visitDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", visitDate=" + visitDate +
                ", description='" + description + '\'' +
                '}';
    }
}