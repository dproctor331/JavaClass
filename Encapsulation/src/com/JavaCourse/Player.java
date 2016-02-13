package com.JavaCourse;

/**
 * Created by Daniel on 11/28/2015.
 */
public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }
    public int healthRemaining() {
        return this.health;
    }

}
