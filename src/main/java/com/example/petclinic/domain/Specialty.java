package com.example.petclinic.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Domain class for Veterinary Specialty
 * Represents specialized areas (Surgery, Radiology, Dentistry, etc.)
 */
public class Specialty implements Serializable, Comparable<Specialty> {
    
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String name;
    private LocalDateTime createdAt;

    public Specialty() {
        this.createdAt = LocalDateTime.now();
    }

    public Specialty(String name) {
        this();
        this.name = name;
    }

    @Override
    public int compareTo(Specialty o) {
        return this.name.compareTo(o.name);
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specialty)) return false;
        Specialty specialty = (Specialty) o;
        return id != null && id.equals(specialty.id);
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}