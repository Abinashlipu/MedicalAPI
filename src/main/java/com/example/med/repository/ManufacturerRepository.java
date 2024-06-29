package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Manufacturer;



@Repository
public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {

    @Query(value = "{ 'code': ?0 }", fields = "{ 'Vendor': 1 }")
    Manufacturer getManufacturerById(String id);
    
}
