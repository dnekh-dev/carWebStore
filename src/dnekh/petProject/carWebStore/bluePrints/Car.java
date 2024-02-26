package dnekh.petProject.carWebStore.bluePrints;

import dnekh.petProject.carWebStore.enums.EngineType;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture;
    private int mileage; //пробег в км
    private EngineType engineType;
    private String transmission;
    private String driverType; //тип привода
    private String VIN;
    private String condition;
    private String features;
    private String descriptions;
    private String availability;
}
