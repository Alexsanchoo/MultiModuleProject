package com.sanchoo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CarTesting {
    private static final Logger LOGGER = LoggerFactory.getLogger(CarTesting.class);
    private final String FILENAME_SETTING = "/not/exist";
    private static final CarTesting carTesting = new CarTesting();

    public static CarTesting getTesting() {
        LOGGER.info("return CarTesting instance");
        return carTesting;
    }

    public boolean testCar(Car car) {
        LOGGER.info("testing power equal to {} of the car {}", car.getPower(), car.getVINnumber());
        if(car.getPower() > 500) {
            LOGGER.info("power of the car {} is more than 500", car.getVINnumber());
            return true;
        }
        else {
            LOGGER.info("power of the car {} is less than 500", car.getVINnumber());
            return false;
        }
    }

    public String readSettings() {
        LOGGER.info("reading setting from the file {}", FILENAME_SETTING);
        try(Reader input = new FileReader(FILENAME_SETTING)) {
            char[] settings = new char[1000];
            input.read(settings);
            LOGGER.info("settings was read from the file {} successfully", FILENAME_SETTING);
            return String.copyValueOf(settings, 0, settings.length);
        } catch (FileNotFoundException e) {
            LOGGER.error("an error occurred", e);
        } catch (IOException e) {
            LOGGER.error("an error occurred", e);
        }
        LOGGER.info("settings from the file {} could not be read", FILENAME_SETTING);
        return null;
    }
}
