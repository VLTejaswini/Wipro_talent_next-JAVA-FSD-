package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    public String getModelName() {
        return "Logan";
    }

    public String getRegistrationNumber() {
        return "AP11AA1111";
    }

    public String getOwnerName() {
        return "Tejaswini";
    }

    public int speed() {
        return 120;
    }

    public void gps() {
        System.out.println("GPS Facility Available");
    }
}