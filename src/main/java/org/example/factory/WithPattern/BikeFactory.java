package org.example.factory.WithPattern;

public class BikeFactory {
    public Bike getBike(String type) {
        if (type==null) return null;
        switch (type.toLowerCase()) {
            case "duke" :
                return new Duke();
            case  "classic350" :
                    return new Classic350();
            case "splendor" :
                return new Splendor();
            default:
                throw new IllegalArgumentException("Bike not found");
        }
    }
}
