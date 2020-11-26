package com.company.vehicles;

public class Vehicle {
    public final static String MAKE = "Augur";
    public static int numVehicles = 0;
    private String chassisNo;
    private String model;

    public Vehicle(String model) {
        this.model = model;
        chassisNo = "ch".concat(Integer.toString(++numVehicles));
        System.out.println("Vehicle manufactured.");
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static String getMAKE() {
        return MAKE;
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + '\n' +
                "The model type is " + model + '\n' +
                "The chassis number is " + chassisNo ;

    }
}
