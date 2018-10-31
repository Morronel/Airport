package com.morronel;

import java.util.List;
import java.util.Scanner;

public class FlightService {

    private List<Plane> planes;
    private List<Flight> flights;

    public FlightService(List<Plane> planes, List<Flight> flights){
        this.planes = planes;
        this.flights = flights;
    }

    public void printInitialMessage(){
        System.out.println("Flight service");
        System.out.println();
        System.out.println("------------");
    }

    private Plane getPlaneById(String id){
        for (Plane randomPlane : planes){
            if (randomPlane.getId().equals(id)){
                return randomPlane;
            }
        }
        return new Plane();
    }

    public void mainServiceLoop(){
        String argument;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose operation:\n" + "[1] Print planes\n" + "[2] Print flights\n" + "[3] Print plane info\n" + "[x] Quit");
            argument = scanner.nextLine();
            if (argument.equals("x")){
                break;
            }
            else if (argument.equals("1")){
                for (Plane plane : planes){
                    System.out.println(plane.getId() + " (" + plane.getCapacity() + " ppl)");
                }
            }
            else if (argument.equals("2")){
                for (Flight flight : flights){
                    Plane plane = getPlaneById(flight.getPlaneId());
                    System.out.println(plane.getId() + " (" + plane.getCapacity() + " ppl) (" + flight.getDepartureCode() + "-" + flight.getDestinationCode() + ")");
                }
            }
            else if (argument.equals("3")){
                System.out.println("Give plane ID: ");
                String planeID = scanner.nextLine();
                Plane plane = getPlaneById(planeID);
                System.out.println(plane.getId() + " (" + plane.getCapacity() + " ppl)");
            }
        } while (!argument.equals("x"));
    }
}
