package com.example.med.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Department")
public class Department {

    @Id
    private String code;
    private String name;

    @DBRef
    private List<Facility> Facility;

    public Department(){
    }

    public Department(String code, String name, List<Facility> facility) {
        this.code = code;
        this.name = name;
        Facility = facility;
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
    public List<Facility> getFacility() {
        return Facility;
    }
    public void setFacility(List<Facility> facility) {
        Facility = facility;
    }
    

    
}

