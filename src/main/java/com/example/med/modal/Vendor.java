package com.example.med.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Vendor")
public class Vendor {
    
    @Id
    private String code;
    private String name;
    private String email;
    private String telephone;
    private String address;
    private String conName;

    @DBRef
    private List<Seller> seller;
    
    public Vendor(String code, String name, String email, String telephone, String address, String conName,
            List<Seller> seller) {
        this.code = code;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.address = address;
        this.conName = conName;
        this.seller = seller;
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
    public List<Seller> getSeller() {
        return seller;
    }
    public void setSeller(List<Seller> seller) {
        this.seller = seller;
    }

    
}
