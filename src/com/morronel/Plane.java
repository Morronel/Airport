package com.morronel;

public class Plane {
    private String id;
    private int capacity;

    public Plane(String thisId, int thisCapatity){
        this.id = thisId;
        this.capacity = thisCapatity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
