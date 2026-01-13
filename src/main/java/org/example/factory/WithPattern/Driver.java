package org.example.factory.WithPattern;

public class Driver {
    public static void main(String[] args) {
        BikeFactory bikeFactory = new BikeFactory();
        Bike duke = bikeFactory.getBike("Duke");
        duke.start();
    }
}
