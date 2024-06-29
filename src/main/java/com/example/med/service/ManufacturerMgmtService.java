package com.example.med.service;


import java.util.List;

import com.example.med.modal.Manufacturer;
import com.example.med.modal.Seller;
import com.example.med.modal.Vendor;

public interface ManufacturerMgmtService {
    
    public Manufacturer createManufacturer(Manufacturer manufacturer);
    public Iterable<Manufacturer> getAllManufacturer();
    public Manufacturer getManufacturerById(String id);
    public List<Vendor> getVendorsByManufacturerId(String id);
    public List<Seller> getSellerByVendorId(String id);
    public Vendor getVendorById(String id);
    public void deleteManufacturer(String id);
}
