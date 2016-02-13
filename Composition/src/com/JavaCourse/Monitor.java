package com.JavaCourse;

public class Monitor {

    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, Resolution nativeResolution, int size, String manufacturer) {
        this.model = model;
        this.nativeResolution = nativeResolution;
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing picture " + x + ", " + y + " of color " + color);
    }
}
