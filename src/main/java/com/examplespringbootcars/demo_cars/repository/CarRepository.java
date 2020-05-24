package com.examplespringbootcars.demo_cars.repository;


import com.examplespringbootcars.demo_cars.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    private List<Car> carList = new ArrayList<>();

    public CarRepository() {
        carList.add(new Car("Ford", "ST01KLM"));
        carList.add(new Car("Fiat", "AS39WEC"));
        carList.add(new Car("Ferrari", "AX99NSX"));
    }

    public List<Car> getAll() {
        return carList;
    }

    public Car getByRegistrationNumber(int id, String registrationNumber) {
        return carList.stream()
                .filter(car -> car.getRegistrationNumber() == registrationNumber)
                .findFirst()
                .orElse(null);
    }

    public void addCar(Car car) {
        carList.add(car);
    }
}
