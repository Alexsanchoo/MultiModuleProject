package com.sanchoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.debug("Program start");
        Car car1 = Car.createCar("Audi", 523);
        Car car2 = Car.createCar("BMW", 323);
        CarTesting test = CarTesting.getTesting();
        boolean resultCar1 = test.testCar(car1);
        boolean resultCar2 = test.testCar(car2);
        String settings = test.readSettings();
        LOGGER.debug("Program finish");
    }
}
