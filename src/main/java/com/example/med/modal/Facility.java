package com.example.med.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Facility")
public class Facility {
    
    @Id
    private String code;
    private String name;

    private List<FacilityType> facilityType;
    
    public Facility(){
    }

    public Facility(String code, String name, List<FacilityType> facilityType) {
        this.code = code;
        this.name = name;
        this.facilityType = facilityType;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<FacilityType> getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(List<FacilityType> facilityType) {
        this.facilityType = facilityType;
    }
    
    
    
}