package com.JavaCourse;

/**
 * Created by Daniel on 11/19/2015.
 */
public class Fish extends Animal {

    private int gills;
    private int fins;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.fins = fins;
        this.eyes = eyes;
    }

    private void rest() {

    }

    private void moveMuscles () {

    }

    private void moveBackFin () {

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
