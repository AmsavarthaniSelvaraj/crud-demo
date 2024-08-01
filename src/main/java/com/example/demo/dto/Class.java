package com.example.demo.dto;

import com.example.demo.entity.Emp;
import com.example.demo.entity.Manager;

public class Class {

}
public void save(ShowroomDto showDto) {
    Showroom showroom = new Showroom();
    showroom.setName(showDto.getName());
    List<Vehicle> list = new ArrayList<>();
    for (VehicleDto vehicleDto : showDto.getVehicle()) {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName(vehicleDto.getVehicleName());
        list.add(vehicle);
    }
    showroom.setLists(list);
    showroomRepository.save(showroom);
}


public Manager addManager(ManagerDto manager) {
    Manager obj=new Manager();
    obj.setName(manager.getName());
    new Arraylist<Emp>();
    manager.setLists(list)
    managerRepository.saveAndFlush(obj);








