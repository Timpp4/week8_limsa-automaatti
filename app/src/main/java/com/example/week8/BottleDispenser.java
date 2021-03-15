package com.example.week8;

import android.widget.TextView;

import java.util.ArrayList;

public class BottleDispenser {
    private static int bottles_number;
    private static int money;


    private static BottleDispenser BD = new BottleDispenser();

    public static BottleDispenser getInstance() {
        return BD;
    }

    // Initialize the arraylist
    ArrayList<Bottle> bottles = new ArrayList<Bottle>();

    Bottle BOT = new Bottle();


    public static int moneyAmount() {
        return money;
    }

    public BottleDispenser() {
        bottles_number = 25;
        money = 0;
        // Add Bottle-objects to the arraylist
        for(int i=0; i<bottles_number; i++) {
            Bottle temp = new Bottle();
            bottles.add(temp);
        }
    }


    public void addMoney(TextView a, TextView b) {
        money += 1;
        a.setText("Klink! Added more money!");
        b.setText("You have " + money + " moneys");

        //System.out.println("Klink! Added more money!");
    }

    public void buyBottle(TextView a, TextView b) {
        for (Bottle bot : bottles) {
            if (money > bot.getPrice()) {
                money -= bot.getPrice();
                a.setText("KACHUNK! " + bot.getName() + " came out of the dispenser!");
                b.setText("You have " + money + " moneys");
                //System.out.println("KACHUNK! " + bot.getName() + " came out of the dispenser!");
                bottles.remove(0);
                bottles_number--;
                break;
            }
            else {
                a.setText("Add money first!");
                //System.out.println("Add money first!");
                break;
            }
        }

    }

    public void returnMoney(TextView a, TextView b) {
        money = 0;
        a.setText("Klink klink. Money came out!");
        b.setText("You have " + money + " moneys");
        //System.out.println("Klink klink. Money came out!");
    }
    public void listBottles(TextView a) {
        a.setText("There are " + bottles_number + " pepsis in the machine!");
        int i = 1;
        for (Bottle bot : bottles) {
            System.out.println(i+". "+ "Name: " + BOT.getName());
            System.out.println("\tSize: " + BOT.getVolume() + "\tPrice: " + bot.getPrice());
            i++;
        }
    }
}