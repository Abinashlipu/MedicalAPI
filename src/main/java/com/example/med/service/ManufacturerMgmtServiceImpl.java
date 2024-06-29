package com.example.med.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.med.modal.Manufacturer;
import com.example.med.modal.Seller;
import com.example.med.modal.Vendor;
import com.example.med.repository.ManufacturerRepository;
import com.example.med.repository.SellerRepository;
import com.example.med.repository.VendorRepository;

@Service
public class ManufacturerMgmtServiceImpl implements ManufacturerMgmtService {

    @Autowired
    private ManufacturerRepository mRepo;

    @Autowired
    private VendorRepository vRepo;

    @Autowired
    private SellerRepository sRepo;

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        List<Vendor> vendors = new ArrayList<>();

        for(Vendor vendor : manufacturer.getVendor()){
            List<Seller> sellers = new ArrayList<>();
            for(Seller seller : vendor.getSeller()){
                Seller sl = new Seller(null, null, null, null, null, null);
                sl.setCode(seller.getCode());
                sl.setName(seller.getName());
                sl.setEmail(seller.getEmail());
                sl.setTelephone(seller.getTelephone());
                sl.setAddress(seller.getAddress());
                sl.setConName(seller.getConName());
                sl = sRepo.save(sl);
                sellers.add(sl);
            }

            Vendor v = new Vendor(null, null, null, null, null, null, sellers);
            v.setCode(vendor.getCode());
            v.setName(vendor.getName());
            v.setEmail(vendor.getEmail());
            v.setTelephone(vendor.getTelephone());
            v.setAddress(vendor.getAddress());
            v.setConName(vendor.getConName());
            v.setSeller(vendor.getSeller());
            v.setSeller(sellers);
            v = vRepo.save(v);
            
            vendors.add(v);
        }

        Manufacturer m = new Manufacturer();
        m.setCode(manufacturer.getCode());
        m.setName(manufacturer.getName());
        m.setEmail(manufacturer.getEmail());
        m.setTelephone(manufacturer.getTelephone());
        m.setAddress(manufacturer.getAddress());
        m.setConName(manufacturer.getConName());
        m.setVendor(manufacturer.getVendor());
        m.setVendor(vendors);
        return mRepo.save(m);
    }

    @Override
    public Iterable<Manufacturer> getAllManufacturer() {
        return mRepo.findAll();
    }

    @Override
    public Manufacturer getManufacturerById(String id) {
        Optional<Manufacturer> b = mRepo.findById(id);
        if(b.isPresent()){
            return b.get();
        }
        else{
            throw new IllegalArgumentException("Manufacturer not Found");
        }
    }

    @Override
    public List<Vendor> getVendorsByManufacturerId(String id) {
        Manufacturer manufacturer = mRepo.getManufacturerById(id);
        List<Vendor> dto = manufacturer.getVendor();
        return dto;
    }

    @Override
    public List<Seller> getSellerByVendorId(String id) {
        Vendor vendor =vRepo.getVendorById(id);
        List<Seller> dto = vendor.getSeller();
        return dto;
    }

    @Override
    public Vendor getVendorById(String id) {
        Optional<Vendor> b = vRepo.findById(id);
        if(b.isPresent()){
            return b.get();
        }
        else{
            throw new IllegalArgumentException("Manufacturer not Found");
        }
    }

    @Override
    public void deleteManufacturer(String id) {
        mRepo.deleteById(id);
    }
    
}
