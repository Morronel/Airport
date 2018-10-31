package com.morronel;

import com.morronel.utils.ConsoleUtils;

import java.util.Arrays;
import java.util.List;

public class FlightService {
    private FlightServiceListener listener;

    private List<Plane> planes;
    private List<Flight> flights;

    public FlightService(FlightServiceListener listener, List<Plane> planes, List<Flight> flights) {
        this.listener = listener;
        this.planes = planes;
        this.flights = flights;
    }

    public void launch() {
        List<String> inputHintMessages = Arrays.asList(
                "Choose operation:",
                "[1] Print planes",
                "[2] Print flights",
                "[3] Print plane info",
                "[x] Quit");

        String input;

        while (!(input = ConsoleUtils.readInputLine(inputHintMessages)).equalsIgnoreCase("x")) {
            switch (input) {
                case "1":
                    for (Plane plane : planes) {
                        System.out.println(plane);
                    }
                    break;
                case "2":
                    for (Flight flight : flights){
                        String planeString = "null";
                        for (Plane plane : planes){
                            if (plane.getId().equals(flight.getPlaneId())){
                                planeString = plane.toString();
                                break;
                            }
                        }
                        System.out.println(planeString + " " + flight);
                    }
                    break;
                case "3":
                    String planeId = ConsoleUtils.readInputLine("Give plane ID: ");
                    for (Plane plane : planes){
                        if (plane.getId().equals(planeId)){
                            System.out.println(plane);
                            break;
                        }
                    }
                    break;
            }
        }
        listener.onFinished();
    }

    public void displayInitialMessage() {
        System.out.println("Flight service");
        System.out.println("--------------------");
        System.out.println();
    }

    interface FlightServiceListener {
        void onFinished();
    }

}
