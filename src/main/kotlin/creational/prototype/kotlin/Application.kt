package creational.prototype.kotlin

fun main() {
    val basicCar = Car(
        innerCarNumber = "0983-9873-0987",
        model = "Renault",
        color = "Red",
        features = listOf("Feature 1")
    )

    val lessBasicCar = basicCar.copy(features = basicCar.features.plus("Feature 2"))
    val badassCar = basicCar.copy(features = basicCar
        .features
        .plus("Feature 3")
        .plus("Feature 4")
    )

    println("Original Car:");
    println("Model: " + basicCar.model);
    println("Color: " + basicCar.color);
    println("Features: " + basicCar.features);

    println("Cloned Car 1 (less basic):");
    println("Model: " + lessBasicCar.model);
    println("Color: " + lessBasicCar.color);
    println("Features: " + lessBasicCar.features);

    println("Cloned Car 2 (badass):");
    println("Model: " + badassCar.model);
    println("Color: " + basicCar.color);
    println("Features: " + badassCar.features);
}
