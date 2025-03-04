package FactoryMethodPattern;

import java.util.Scanner;

public class FactoryMethod {
    private static Logistic logistic;

    public static void demoFactoryMethod() {
        System.out.println("--UIT Logistics--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of Logistics: ");
        String type = scanner.next();

        createTransport(type);
        delivery();
    }

    //--Factory Method--\\

    static void createTransport(String typeLogistic) {
        switch (typeLogistic){
            case "road":
                logistic = new RoadLogistic();
                break;
            case "sea":
                logistic = new SeaLogistic();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + typeLogistic);
        }
    }

    static void delivery() {
        logistic.delivery();
    }
}
