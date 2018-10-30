package com.morronel;

import java.util.List;
import java.util.Scanner;

public class FlightService {

    List<Plane> pList;
    List<Flight> fList;

    public FlightService(List<Plane> thisPlist, List<Flight> thisFlist){
        this.pList = thisPlist;
        this.fList = thisFlist;
    }

    public void initialMessage(){
        System.out.println("Flight service\n" + "------------\n");
    }

    private Plane getPlaneById(String id){
        Plane plane = new Plane();
        for (Plane randomPlane : pList){
            if (randomPlane.getId().equals(id)){
                plane = randomPlane;
            }
        }
        return plane;
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
                for (Plane plane : pList){
                    System.out.println(plane.getId() + " (" + plane.getCapacity() + " ppl)");
                }
            }
            else if (argument.equals("2")){
                for (Flight flight : fList){
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
