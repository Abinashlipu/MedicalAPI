package com.example.med.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Seller")
public class Seller {
    
    @Id
    private String code;
    private String name;
    private String email;
    private String telephone;
    private String address;
    private String conName;
    
    public Seller(String code, String name, String email, String telephone, String address, String conName) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.conName = conName;
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getConName() {
        return conName;
    }
    public void setConName(String conName) {
        this.conName = conName;
    }
    
}
