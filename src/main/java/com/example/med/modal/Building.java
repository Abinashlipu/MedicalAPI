package com.example.med.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Building")
public class Building {

    @Id
    private String code;

    private String name;

    @DBRef
    private List<Department> department;

    public Building(){
    }
    
    public Building(String code, String name, List<Department> department) {
        this.code = code;
        this.name = name;
        this.department = department;
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


    public List<Department> getDepartment() {
        return department;
    }


    public void setDepartment(List<Department> department) {
        this.department = department;
    }
    
      
    
}
