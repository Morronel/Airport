package com.morronel;

public class Main {

    public static void main(String[] args) {
        AirportPanel airportPanel = new AirportPanel();

        airportPanel.printInitialMessage();
        airportPanel.mainPanelLoop();

        FlightService flightService = new FlightService(airportPanel.getPlanes(), airportPanel.getFlights());

        flightService.printInitialMessage();
        flightService.mainServiceLoop();
    }
}
