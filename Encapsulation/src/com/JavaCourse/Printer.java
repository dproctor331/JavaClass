package com.JavaCourse;

/**
 * Created by Daniel on 11/28/2015.
 */
public class Printer {
    private float tonerLevel = 100;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(float tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void printDocument(int pages, String documentName) {
        this.pagesPrinted += pages;
        this.tonerLevel -= (pages/5);
        System.out.println(documentName + " was successfully printed");
        System.out.println(this.tonerLevel + " toner remaining");
    }

    public void fillToner() {
        this.tonerLevel = 100;
    }

    public float getTonerLevel() {
        return tonerLevel;
    }
}
