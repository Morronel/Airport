package com.morronel;

public class Flight {
    private String planeId;
    private String departureCode;
    private String destinationCode;

    public Flight(String thisPlaneId, String thisDepCode, String thisDestCode){
        this.planeId = thisPlaneId;
        this.departureCode = thisDepCode;
        this.destinationCode = thisDestCode;
    }

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }
}