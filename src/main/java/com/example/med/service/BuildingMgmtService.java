package com.example.med.service;

import com.example.med.modal.Building;


public interface BuildingMgmtService {

    public Building createBuilding(Building building);
    public Iterable<Building> getAllBuildings();
    public void deleteBuilding(String id);
    public Building getBuildingById(String id);
    
}
