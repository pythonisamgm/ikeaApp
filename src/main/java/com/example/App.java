package com.example;
import java.util.Scanner;


public final class App {
    private App() {
    }

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Please, select a type of furniture: ");
       String type = sc.nextLine().toLowerCase();
       System.out.println("You selected "+type);

       System.out.println("Please, select the material of your choice: ");
       String material = sc.nextLine().toLowerCase();
       System.out.println("You selected "+ material );

       System.out.println("Please, select the color of your choice: ");
       String color = sc.nextLine().toLowerCase();
       System.out.println("You selected "+ color );

       System.out.println("You are going to loose some screws (if you already didn't). How many extra screws do you need: ");
       int numberScrews = sc.nextInt();
       System.out.println("You selected "+ numberScrews + " extra screws.");

       /* System.out.println("Please, select the payment mode (cash or card): ");
       String payment = sc.nextLine();
       System.out.println("you selected"+ furnitureColor ); */

       sc.close();

       IkeaFurniture furniture1 = new IkeaFurniture(type, material, color, numberScrews);

       System.out.println("This is your order so far: \n" + "You want a "+furniture1.type +" made of " + furniture1.material + " in "+furniture1.color + " color " + "and you need "+ furniture1.extraScrews + " extra screws.\n" );



    }
}
