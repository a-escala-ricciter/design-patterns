package creational.prototype.java;

import java.util.ArrayList;
import java.util.List;

interface Prototype {
    Prototype clone();
}

class InnerCar {
    private final String innerCarNumber;

    public InnerCar(String innerCarNumber) {
        this.innerCarNumber = innerCarNumber;
    }

    public String getInnerCarNumber() {
        return innerCarNumber;
    }
}

public class Car extends InnerCar implements Prototype {
    private final String model;
    private final String color;
    private final List<String> features;

    public Car(String innerCarNumber, String model, String color) {
        super(innerCarNumber);
        this.model = model;
        this.color = color;
        this.features = new ArrayList<>();
    }

    public void addFeature(String feature) {
        this.features.add(feature);
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public List<String> getFeatures() {
        return features;
    }

    // constructor created to be used by the `clone()` method
    private Car(Car car) {
        super(car.getInnerCarNumber());
        this.model = car.model;
        this.color = car.color;
        this.features = new ArrayList<>(car.features);
    }

    @Override
    public Prototype clone() {
        return new Car(this);
    }
}
