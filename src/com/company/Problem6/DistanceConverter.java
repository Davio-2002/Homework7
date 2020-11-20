package com.company.Problem6;

public class DistanceConverter {
    public Meters milesToMeters(Miles miles) {
        Meters meters = new Meters();
        meters.setDistance(miles.getDistance() * 1609);

        return meters;
    }

    public Miles metersToMiles(Meters meters) {
        Miles miles = new Miles();
        miles.setDistance(meters.getDistance() / 1609);

        return miles;
    }
}
