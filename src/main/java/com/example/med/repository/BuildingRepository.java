package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Building;

@Repository
public interface BuildingRepository extends MongoRepository<Building, String> {
    
}
