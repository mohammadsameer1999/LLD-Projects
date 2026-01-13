package org.example.factory.WithoutPattern;

public class Driver {
    public static void main(String[] args) {
        String type = "Duke";
        Bike bike = null;
        if (type.equalsIgnoreCase("Duke")) {
            bike = new Duke();
        } else if (type.equalsIgnoreCase("Classic350")) {
            bike = new Classic350();

        } else if (type.equalsIgnoreCase("Splendor")) {
            bike = new Splendor();

        }
        if (bike!=null) {
            bike.start();
        } else {
            System.out.println("Bike not  available ");
        }
    }
}
