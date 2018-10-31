package com.morronel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportPanel {
    private List<Flight> flightList = new ArrayList<>();
    private List<Plane> planeList = new ArrayList<>();

    public void printInitialMessage(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();
    }

    public String askForInput(){
        System.out.println("Choose operation:\n" + "[1] Add airplane\n" + "[2] Add flight\n" + "[x] Exit");
        return (new Scanner(System.in)).nextLine();
    }

    public void mainPanelLoop(){
        String argument;
        Scanner scanner = new Scanner(System.in);

        while (!(argument = askForInput()).equalsIgnoreCase("x")){
            if (argument.equals("1")){
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                planeList.add(new Plane(id, capacity));
            }
            else if (argument.equals("2")){
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give departure airport code: ");
                String depCode = scanner.nextLine();
                System.out.println("Give destination airport code: ");
                String destCode = scanner.nextLine();
                flightList.add(new Flight(id, depCode, destCode));
            }
        }
    }

    public List<Plane> getPlanes(){
        return planeList;
    }

    public List<Flight> getFlights(){
        return flightList;
    }
}
