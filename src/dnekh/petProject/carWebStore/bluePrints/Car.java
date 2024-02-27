package dnekh.petProject.carWebStore.bluePrints;

import dnekh.petProject.carWebStore.enums.Condition;
import dnekh.petProject.carWebStore.enums.DriverType;
import dnekh.petProject.carWebStore.enums.EngineType;
import dnekh.petProject.carWebStore.enums.TransmissionType;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfManufacture; //год выпуска
    private int mileage; //пробег в км
    private EngineType engineType; //тип двигателя
    private TransmissionType transmissionType; //тип трансмиссии
    private DriverType driverType; //тип привода
    private String VIN; //vehicle identification number (VIN) - это уникальный идентификационный номер автомобиля, который состоит из 17 символов, включающих в себя цифры и буквы (за исключением букв I, O, Q, чтобы избежать путаницы с цифрами 1 и 0). Этот номер служит своеобразным "отпечатком пальца" для каждого транспортного средства, позволяя идентифицировать конкретные характеристики автомобиля, такие как страна производитель, производитель, тип транспортного средства, год выпуска и завод-изготовитель.
    private Condition condition; //состояние: new or used
    private String features; //список опций
    private String descriptions; //краткое описание
    private String availability; //доступность в данный момент
}
