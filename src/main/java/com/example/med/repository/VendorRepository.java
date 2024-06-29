package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Vendor;

@Repository
public interface VendorRepository extends MongoRepository<Vendor, String> {

    @Query(value = "{ 'code': ?0 }", fields = "{ 'Seller': 1 }")
    Vendor getVendorById(String id);

}
