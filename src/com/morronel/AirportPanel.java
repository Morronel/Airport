package com.morronel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirportPanel {
    private List<Flight> flightList = new ArrayList<>();
    private List<Plane> planeList = new ArrayList<>();

    public AirportPanel(){

    }

    public void initialMessage(){
        System.out.println("Airport panel\n--------------------\n");
    }

    public void mainPanelLoop(){
        String argument;

        do {
            System.out.println("Choose operation:\n" + "[1] Add airplane\n" + "[2] Add flight\n" + "[x] Exit");
            Scanner scanner = new Scanner(System.in);
            argument = scanner.nextLine();
            if (argument.equals("x")){
                break;
            }
            if (argument.equals("1")){
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity = Integer.parseInt(scanner.nextLine());
                Plane plane = new Plane(id, capacity);
                planeList.add(plane);
            }
            if (argument.equals("2")){
                System.out.println("Give plane ID: ");
                String id = scanner.nextLine();
                System.out.println("Give departure airport code: ");
                String depCode = scanner.nextLine();
                System.out.println("Give destination airport code: ");
                String destCode = scanner.nextLine();
                Flight flight = new Flight(id, depCode, destCode);
                flightList.add(flight);
            }
        } while (!argument.equals("x"));
    }
}
