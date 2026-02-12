package com.example.petclinic.jsf.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
// import javax.faces.convert.FacesConverter;

import com.example.petclinic.domain.Owner;

// @FacesConverter("ownerConverter")
public class OwnerConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.isEmpty()) {
            return null;
        }
        // Assuming Owner has a method to find by ID
        return findOwnerById(Long.valueOf(value));
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof Owner) {
            return String.valueOf(((Owner) value).getId());
        } else {
            throw new IllegalArgumentException("Object is not an instance of Owner");
        }
    }

    private Owner findOwnerById(Long id) {
        // Implement the logic to retrieve the Owner by ID from the database or service
        return null; // Placeholder for actual implementation
    }
}