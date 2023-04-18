package com.data.garage.service;

import com.data.garage.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.data.garage.repository.GarageRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;


@Service
public class GarageService {
    @Autowired
    private GarageRepository garageRepository;
    public Iterable<Car> getCars() {
        return garageRepository.findAll();
    }
    public Car getCar(final Long id) {
        return garageRepository.findById(id).orElse(null);
    }
    public void addCar(Car car) {
        garageRepository.save(car);
    }
    public void deleteCar(Long id) {
        garageRepository.deleteById(id);
    }
    public void modifyCar(Car car, Long id) {
        garageRepository.findById(id).map(car1 -> {
            car1.setBrand(car.getBrand());
            car1.setDate(car.getDate());
            car1.setModel(car.getModel());
            car1.setColor(car.getColor());
            return garageRepository.save(car);
        }).orElseGet(() -> {
            car.setId(id);
            return garageRepository.save(car);
            }
        );
    }
}
