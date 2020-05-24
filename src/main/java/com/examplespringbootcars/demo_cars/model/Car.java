package com.examplespringbootcars.demo_cars.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.io.Serializable;

// Serializable
@JsonAutoDetect
public class Car implements Serializable {

    private String brand;
    private String registrationNumber;

    public Car(String brand, String registrationNumber) {
        this.brand = brand;
        this.registrationNumber = registrationNumber;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
