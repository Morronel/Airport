package com.morronel;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        AirportPanel airportPanel = new AirportPanel();

        airportPanel.initialMessage();
        airportPanel.mainPanelLoop();

        FlightService flightService = new FlightService(airportPanel.getPlanes(), airportPanel.getFlights());

        flightService.initialMessage();
        flightService.mainServiceLoop();
    }
}
