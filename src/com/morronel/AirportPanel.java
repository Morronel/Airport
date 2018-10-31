package com.morronel;

import com.morronel.utils.ConsoleUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportPanel {

    private AirportPanelListener listener;

    public AirportPanel(AirportPanelListener listener) {
        this.listener = listener;
    }

    public void launch() {

        List<Plane> planes = new ArrayList<>();
        List<Flight> flights = new ArrayList<>();

        List<String> inputHintMessages = Arrays.asList(
                "Choose operation:",
                "[1] Add airplane",
                "[2] Add flight",
                "[x] Exit");

        String input;

        while (!(input = ConsoleUtils.readInputLine(inputHintMessages)).equalsIgnoreCase("x")) {
            switch (input) {
                //Blocks so that the variables don't share the same scope
                case "1": {
                    String planeId = ConsoleUtils.readInputLine("Give plane ID: ");
                    int capacity = ConsoleUtils.readInputLineInteger("Give plane capacity: ");
                    planes.add(new Plane(planeId, capacity));
                    break;
                }
                case "2": {
                    String planeId = ConsoleUtils.readInputLine("Give plane ID: ");
                    String departureCode = ConsoleUtils.readInputLine("Give departure airport code: ");
                    String destinationCode = ConsoleUtils.readInputLine("Give destination airport code: ");
                    flights.add(new Flight(planeId, departureCode, destinationCode));
                    break;
                }
            }
        }

        listener.onInputFinished(planes, flights);
    }

    public void displayInitialMessage() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
    }

    interface AirportPanelListener {
        void onInputFinished(List<Plane> planes, List<Flight> flights);
    }
}
