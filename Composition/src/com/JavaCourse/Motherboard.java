package com.JavaCourse;

/**
 * Created by Daniel on 11/21/2015.
 */
public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlot;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String bios, int cardSlots, int ramSlot, String manufacturer) {
        this.model = model;
        this.bios = bios;
        this.cardSlots = cardSlots;
        this.ramSlot = ramSlot;
        this.manufacturer = manufacturer;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading...");
    }

    public String getModel() {
        return model;
    }

    public String getBios() {
        return bios;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
