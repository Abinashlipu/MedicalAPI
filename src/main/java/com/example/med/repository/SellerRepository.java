package com.example.med.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.med.modal.Seller;



@Repository
public interface SellerRepository extends MongoRepository<Seller, String> {
    
}