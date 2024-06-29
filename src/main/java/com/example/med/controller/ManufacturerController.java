package com.example.med.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.med.modal.Manufacturer;
import com.example.med.modal.Seller;
import com.example.med.modal.Vendor;
import com.example.med.service.ManufacturerMgmtServiceImpl;

@RestController
@RequestMapping("/api")
public class ManufacturerController {
    
    @Autowired
    private ManufacturerMgmtServiceImpl mMgmt;

    @PostMapping("/manufacturer")
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return mMgmt.createManufacturer(manufacturer);
    }

    @GetMapping("/manufacturer")
    public Iterable<Manufacturer> getAllManufacturer(){
        return mMgmt.getAllManufacturer();
    }

    @GetMapping("/manufacturer/{id}/vendor")
    public List<Vendor> getVendorsByManufacturerId(@PathVariable String id) {
        return mMgmt.getVendorsByManufacturerId(id);
    }

    @GetMapping("/vendor/{id}/seller")
    public List<Seller> getSellerByVendorId(@PathVariable String id) {
        return mMgmt.getSellerByVendorId(id);
    }

    @DeleteMapping("/manufacturer/{id}")
    public void deleteManufacturer(@PathVariable String id) {
        mMgmt.deleteManufacturer(id);
    }

    @GetMapping("/manufacturer/{id}")
    public Manufacturer getManufacturerById(@PathVariable(value = "id") String manufacturerId){
        return mMgmt.getManufacturerById(manufacturerId);
    }
}
