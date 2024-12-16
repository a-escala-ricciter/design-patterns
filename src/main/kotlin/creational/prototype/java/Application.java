package creational.prototype.java;

public class Application {
    public static void main(String... args) {
        Car basicRenault = new Car("0982-9874-9823", "Renault", "Red");
        basicRenault.addFeature("Feature 1");

        Car lessBasicRenault = (Car) basicRenault.clone();
        lessBasicRenault.addFeature("Feature 2");

        Car badassRenault = (Car) lessBasicRenault.clone();
        badassRenault.addFeature("Feature 3");
        badassRenault.addFeature("Feature 4");

        System.out.println("Original Car:");
        System.out.println("Model: " + basicRenault.getModel());
        System.out.println("Color: " + basicRenault.getColor());
        System.out.println("Features: " + basicRenault.getFeatures());

        System.out.println("Cloned Car 1 (less basic):");
        System.out.println("Model: " + lessBasicRenault.getModel());
        System.out.println("Color: " + lessBasicRenault.getColor());
        System.out.println("Features: " + lessBasicRenault.getFeatures());

        System.out.println("Cloned Car 2 (badass):");
        System.out.println("Model: " + badassRenault.getModel());
        System.out.println("Color: " + badassRenault.getColor());
        System.out.println("Features: " + badassRenault.getFeatures());
    }
}
