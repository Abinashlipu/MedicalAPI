package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, String> {
    
}
