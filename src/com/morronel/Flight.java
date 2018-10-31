package com.morronel;

public class Flight {
    private String planeId;
    private String departureCode;
    private String destinationCode;

    public Flight(String planeId, String departureCode, String destinationCode){
        this.planeId = planeId;
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String getPlaneId() {
        return planeId;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }
}