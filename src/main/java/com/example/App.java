package com.example;


public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        IkeaFurniture furniture1 = new IkeaFurniture();

        furniture1.insertType();
        System.out.println("You selected " + furniture1.type);

        furniture1.insertMaterial();
        System.out.println("You selected " + furniture1.material);

        furniture1.insertColor();
        System.out.println("You selected " + furniture1.color);

        furniture1.insertExtraScrews();
        System.out.println("You selected " + furniture1.extraScrews + " extra screws.");

        System.out.println(furniture1.toString());

        furniture1.closeScanner();
    }
}
