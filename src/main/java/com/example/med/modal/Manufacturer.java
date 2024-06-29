package com.example.med.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Manufacturer")
public class Manufacturer {
    
    @Id
    private String code;
    private String name;
    private String email;
    private String telephone;
    private String address;
    private String conName;

    @DBRef
    private List<Vendor> vendor;


    public Manufacturer(String code, String name, String email, String telephone, String address, String conName,
            List<Vendor> vendor) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.conName = conName;
        this.vendor = vendor;
    }

    public Manufacturer() {
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
    public List<Vendor> getVendor() {
        return vendor;
    }
    public void setVendor(List<Vendor> vendor) {
        this.vendor = vendor;
    }
    

}

