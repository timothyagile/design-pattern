package Exercise.BT2.BuilderPattern;

public class Client {
    public static void operate() {
        Director director = new Director();
        System.out.println("\nMediterranean: ");
        System.out.println(director.createMediterranean().toString());

        System.out.println("\nDASH: ");
        System.out.println(director.createDash().toString());

        System.out.println("\nVegetable: ");
        System.out.println(director.createVegetable().toString());

    }
}
