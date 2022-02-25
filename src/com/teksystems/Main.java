package com.teksystems;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monster m1 = new FireMonster("Charzard"); // upcast
        Monster m2 = new WaterMonster("Squirtle"); // upcast
        Monster m3 = new StoneMonster("Golem");
        System.out.println(m1.attack());
        System.out.println(m2.attack());
        System.out.println(m3.attack());

        m1 = new StoneMonster("Greater Golem");
        System.out.println(m1.attack());

        Monster m4 = new Monster ("normal mon");
        System.out.println(m4.attack());
    }
}
