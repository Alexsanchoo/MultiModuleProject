package com.sanchoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class Car {
    private final static Logger LOGGER = LoggerFactory.getLogger(Car.class);

    private final String VINnumber;
    private final String brand;
    private final int power;

    private Car(String VINnumber, String brand, int power) {
        LOGGER.info("creating car {}", VINnumber);
        this.VINnumber = VINnumber;
        this.brand = brand;
        this.power = power;
        LOGGER.info("created car {}", VINnumber);
    }

    public static Car createCar(String brand, int power) {
        String VINnumber = UUID.randomUUID().toString();
        return new Car(VINnumber, brand, power);
    }

    public String getVINnumber() {
        return VINnumber;
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return new StringBuilder("Car{ ")
                .append("VINnumber= ").append(VINnumber).append(", ")
                .append("brand= ").append(brand).append(", ")
                .append("power= ").append(power)
                .append("}")
                .toString();
    }
}
