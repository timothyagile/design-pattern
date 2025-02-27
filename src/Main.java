import FactoryMethodPattern.Logistic;
import FactoryMethodPattern.RoadLogistic;
import FactoryMethodPattern.SeaLogistic;

import java.util.Scanner;

public class Main {
    private static Logistic logistic;
    public static void main(String[] args) {
        System.out.println("--UIT Logistics--");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type of Logistics: ");
        String type = scanner.next();

        createTransport(type);
        delivery();
    }

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