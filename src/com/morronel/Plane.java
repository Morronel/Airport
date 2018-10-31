package com.morronel;

public class Plane {
    private String id;
    private int capacity;

    public Plane(){

    }

    public Plane(String thisId, int thisCapatity){
        this.id = thisId;
        this.capacity = thisCapatity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
}
