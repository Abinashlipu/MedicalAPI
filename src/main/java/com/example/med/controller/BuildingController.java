package com.example.med.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.med.modal.Building;
import com.example.med.service.BuildingMgmtServiceImpl;

@RestController
@RequestMapping("/api")
public class BuildingController {

    @Autowired
    private BuildingMgmtServiceImpl buMgmt;

    @PostMapping("/building")
    public Building createBuilding(@RequestBody Building building) {
        return buMgmt.createBuilding(building);
    }

    @GetMapping("/building")
    public Iterable<Building> getAllBuildings(){
        return buMgmt.getAllBuildings();
    }

    @DeleteMapping("/building/{id}")
    public void deleteBuilding(@PathVariable String id) {
        buMgmt.deleteBuilding(id);
    }

    @GetMapping("/building/{id}")
    public Building getBuildingById(@PathVariable(value = "id") String buildingId){
        return buMgmt.getBuildingById(buildingId);
    }
    
}
