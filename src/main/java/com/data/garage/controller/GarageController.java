package com.data.garage.controller;

import com.data.garage.model.Car;
import com.data.garage.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class GarageController {
    @Autowired
    private GarageService garageService;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        return garageService.getCars();
    }

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable("id") Long id){
        return garageService.getCar(id);
    }


    @RequestMapping( method = RequestMethod.POST,value = "/cars")
    public void addCar(@RequestBody Car car) {
        garageService.addCar(car);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable("id") Long id) {
        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void modifyCar(@RequestBody Car car, @PathVariable("id") Long id) {
        garageService.modifyCar(car, id);
    }
}
