package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
	    Case theCase = new Case("220B", "Dell", "110", dimensions);

        Monitor theMonitor = new Monitor("Samsung 1100", new Resolution(2540, 1440), 27, "Acer");

        Motherboard theMotherboard = new Motherboard("BJ-200" , "Asus", 4,4, "v2.4.4");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        thePC.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(12, 25);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Dan's Room", wall1, wall2, wall3, wall4, ceiling,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();

    }
}
