package com.morronel;

import java.util.List;

public class Airport implements AirportPanel.AirportPanelListener, FlightService.FlightServiceListener {

    public Airport(){
        AirportPanel airportPanel = new AirportPanel(this);
        airportPanel.displayInitialMessage();
        airportPanel.launch();
    }

    @Override
    public void onInputFinished(List<Plane> planes, List<Flight> flights) {
        FlightService flightService = new FlightService(this, planes, flights);
        flightService.displayInitialMessage();
        flightService.launch();
    }

    @Override
    public void onFinished() {
        System.out.println("FINISHED, QUITTING!");
    }
}
