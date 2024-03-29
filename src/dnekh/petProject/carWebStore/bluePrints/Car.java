package dnekh.petProject.carWebStore.bluePrints;

import dnekh.petProject.carWebStore.enums.Condition;
import dnekh.petProject.carWebStore.enums.DriverType;
import dnekh.petProject.carWebStore.enums.EngineType;
import dnekh.petProject.carWebStore.enums.TransmissionType;

public abstract class Car {
    private static int nextId = 1;
    private int id;
    private final String brand;
    private final String model;
    private String color;
    private final int yearOfManufacture; //год выпуска
    private int mileage; //пробег в км
    private EngineType engineType; //тип двигателя
    private TransmissionType transmissionType; //тип трансмиссии
    private DriverType driverType; //тип привода
    private final String VIN; //vehicle identification number (VIN)
    private Condition condition; //состояние: new or used
    private String features; //список опций
    private String descriptions; //краткое описание
    private String availability; //доступность в данный момент

    public Car(String brand, String model, String color, int yearOfManufacture, int mileage, EngineType engineType, TransmissionType transmissionType, DriverType driverType, String VIN, Condition condition, String features, String descriptions, String availability) {
        this.id = nextId++;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
        this.driverType = driverType;
        this.VIN = VIN;
        this.condition = condition;
        this.features = features;
        this.descriptions = descriptions;
        this.availability = availability;
    }

    public abstract void displayInfo();

    //getters and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public TransmissionType getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(TransmissionType transmissionType) {
        this.transmissionType = transmissionType;
    }

    public DriverType getDriverType() {
        return driverType;
    }

    public void setDriverType(DriverType driverType) {
        this.driverType = driverType;
    }

    public String getVIN() {
        return VIN;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
