package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("Kunde: Durst!");
        String beverage = null;
        beverage = orderFromWaiter();
        System.out.println("Kunde: Genießt " + beverage);

    }

    public static String orderFromWaiter() {

        System.out.println("Kellner: Bestellung aufgenommen!");
        String beverage = null;

        try {
            beverage = getBeverageFromFridge();
        } catch (Exception ex) {
            System.out.println("Kellner rennt zum Kiosk und kauft ein Bier");
            beverage = "Bier vom Kiosk";
        }

        System.out.println("Kellner: " + beverage + " geholt");
        return "ein eiskaltes " + beverage;

    }

    public static String getBeverageFromFridge() throws WarmBeerException {

        //return "Bier";
        throw new WarmBeerException("The fridge is broken, sh*t!");

    }

}