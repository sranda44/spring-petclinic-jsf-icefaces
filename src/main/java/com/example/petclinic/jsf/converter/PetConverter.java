package com.example.petclinic.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
// import javax.faces.convert.FacesConverter;

import com.example.petclinic.domain.Pet;

// @FacesConverter("petConverter")
public class PetConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        // Assuming Pet has a method to find by ID
        return Pet.findByOwnerId(Long.valueOf(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof Pet) {
            return String.valueOf(((Pet) value).getId());
        } else {
            throw new IllegalArgumentException("Object is not a Pet");
        }
    }
}