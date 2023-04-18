package com.data.garage.repository;

import com.data.garage.model.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarageRepository extends  CrudRepository<Car, Long> {}