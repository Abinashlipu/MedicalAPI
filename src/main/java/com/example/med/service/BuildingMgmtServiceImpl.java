package com.example.med.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.med.modal.Building;
import com.example.med.modal.Department;
import com.example.med.modal.Facility;
import com.example.med.repository.BuildingRepository;
import com.example.med.repository.DepartmentRepository;
import com.example.med.repository.FacilityRepository;

@Service
public class BuildingMgmtServiceImpl implements BuildingMgmtService {

    @Autowired
    private BuildingRepository bRepo;

    @Autowired
    private DepartmentRepository dRepo;

    @Autowired
    private FacilityRepository fRepo;

    @Override
    public Building createBuilding(Building building) {
        List<Department> departments = new ArrayList<>();

        for (Department department : building.getDepartment()) {
            List<Facility> facilitys = new ArrayList<>();
            for (Facility facility : department.getFacility()) {
                Facility fy = new Facility();
                fy.setCode(facility.getCode());
                fy.setName(facility.getName());
                fy.setFacilityType(facility.getFacilityType());
                fy = fRepo.save(fy);
                facilitys.add(fy);
            }

            Department dp = new Department();
            dp.setCode(department.getCode());
            dp.setName(department.getName());
            dp.setFacility(department.getFacility());
            dp.setFacility(facilitys);
            dp = dRepo.save(dp);

            departments.add(dp);
        }

        Building bu = new Building();
        bu.setCode(building.getCode());
        bu.setName(building.getName());
        bu.setDepartment(building.getDepartment());
        bu.setDepartment(departments);;

        return bRepo.save(bu);
    }

    @Override
    public Iterable<Building> getAllBuildings() {
        return bRepo.findAll();
    }

    @Override
    public void deleteBuilding(String id) {
        bRepo.deleteById(id);
    }

    @Override
    public Building getBuildingById(String id) {
        Optional<Building> b = bRepo.findById(id);
        if(b.isPresent()){
            return b.get();
        }
        else{
            throw new IllegalArgumentException("Building not Found");
        }
    }
    
}
