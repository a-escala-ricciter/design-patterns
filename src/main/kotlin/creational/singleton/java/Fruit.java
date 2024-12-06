package creational.singleton.java;

public class Fruit {
    private Fruit() {}

    private String color;
    private String shape;

    private static volatile Fruit fruit = null;

    public static Fruit getInstance() {
        if (fruit == null) {
            synchronized (Fruit.class) {
                if (fruit == null) {
                    fruit = new Fruit();
                }
            }
        }

        return fruit;
    }
}
