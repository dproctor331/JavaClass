package com.JavaCourse;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(int cylinders) {
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine() {
        if (this.engine == true) {
            System.out.println("Car: Starting Engine");
        } else {
            System.out.println("Car: Car has no engine");
        }
    }

    public void accelerate() {
        if (this.engine == true) {
            System.out.println("Car: Accelerating");
        } else {
            System.out.println("Car: Car has no engine");
        }
    }

    public void brake() {
        System.out.println("Car: Breaking");
    }
}

class Subaru extends Car {

    private String brand;

    public Subaru(int cylinders) {
        super(cylinders);
        this.brand = "Subaru";
    }

    public String getBrand() {
        return brand;
    }

    public void startEngine() {
        if (this.isEngine() == true) {
            System.out.println("Subaru: Starting Engine");
        } else {
            System.out.println("Subaru: Car has no engine");
        }
    }

    public void accelerate() {
        if (this.isEngine() == true) {
            System.out.println("Subaru: Accelerating");
        } else {
            System.out.println("Subaru: Car has no engine");
        }
    }

    public void brake() {
        System.out.println("Subaru: Breaking");
    }
}

public class Main {

    public static void main(String[] args) {
        Car lambo = new Car(12);
        Subaru legacy = new Subaru(4);

        lambo.accelerate();
        legacy.accelerate();
    }
}
