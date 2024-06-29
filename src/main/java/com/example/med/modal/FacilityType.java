package com.example.med.modal;

import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="FacilityType")
public class FacilityType {

    
    private String description;
    private List<String> operational;
    private List<String> manufacturer;
    private List<String> specialization;

    public FacilityType (){
    }

    public FacilityType(String description, List<String> operational, List<String> manufacturer,
            List<String> specialization) {
        
        this.description = description;
        this.operational = operational;
        this.manufacturer = manufacturer;
        this.specialization = specialization;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<String> getOperational() {
        return operational;
    }
    public void setOperational(List<String> operational) {
        this.operational = operational;
    }
    public List<String> getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(List<String> manufacturer) {
        this.manufacturer = manufacturer;
    }
    public List<String> getSpecialization() {
        return specialization;
    }
    public void setSpecialization(List<String> specialization) {
        this.specialization = specialization;
    }
}

