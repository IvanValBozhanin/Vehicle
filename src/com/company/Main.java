package com.company;

import com.company.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Manufacturer: " + Vehicle.MAKE);
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
        Vehicle v1 = new Vehicle("Vision");
        System.out.println(v1.toString());
        Vehicle v2 = new Vehicle("Edict");
        System.out.println(v2.toString());
        System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
    }
}
