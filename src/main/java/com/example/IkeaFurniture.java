package com.example;

import java.util.Scanner;

public class IkeaFurniture {
    String type;
    String material;
    String color;
    int extraScrews;
    Scanner sc;

    public IkeaFurniture() {
        this.type = "";
        this.material = "";
        this.color = "";
        this.extraScrews = 0;
        this.sc = new Scanner(System.in);
    }

    public void insertType() {
        System.out.println("Please, select a type of furniture: ");
        this.type = this.sc.nextLine().toLowerCase();
    }

    public void insertMaterial() {
        System.out.println("Please, select the material of your choice: ");
        this.material = this.sc.nextLine().toLowerCase();
    }

    public void insertColor() {
        System.out.println("Please, select the color of your choice: ");
        this.color = this.sc.nextLine().toLowerCase();
    }

    public void insertExtraScrews() {
        System.out.println("You are going to lose some screws (if you already didn't). How many extra screws do you need: ");
        this.extraScrews = this.sc.nextInt();
        sc.nextLine(); 
    }
    public void closeScanner() {
        this.sc.close();
    }
    
    public String toString() {
        return "This is your order so far: \n" +
               "You want a " + this.type + " made of " + this.material + " in " + this.color + " color " +
               "and you need " + this.extraScrews + " extra screws.\n";
    }
}
