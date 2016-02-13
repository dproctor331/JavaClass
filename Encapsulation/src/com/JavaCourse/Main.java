package com.JavaCourse;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Dan";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//
//        player.loseHealth(damage);
//
//        System.out.println("Remaining Health is " + player.healthRemaining());
//
//        damage = 11;
//
//        player.loseHealth(damage);
//
//        System.out.println("Remaining Health is " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Dan", 15, "Gun");
        System.out.println("Initial health is " + player.getHealth());

    }
}
