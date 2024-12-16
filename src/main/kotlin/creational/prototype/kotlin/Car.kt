package creational.prototype.kotlin

open class InnerCar(
    open val innerCarNumber: String
)

data class Car(
    override val innerCarNumber: String,
    val color: String,
    val model: String,
    val features: List<String> = mutableListOf()
): InnerCar(innerCarNumber)
