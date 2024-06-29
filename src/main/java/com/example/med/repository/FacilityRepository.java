package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Facility;

@Repository
public interface FacilityRepository extends MongoRepository<Facility, String> {
    
}
