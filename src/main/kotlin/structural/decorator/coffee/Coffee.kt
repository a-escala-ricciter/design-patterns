package structural.decorator.coffee

/** Coffee Decorator example: Dynamically add features to a coffee */
// Component
interface Coffee {
    fun cost(): Double
    fun description(): String
}

// Concrete Component
class BasicCoffee : Coffee {
    override fun cost() = 2.0
    override fun description() = "Basic Coffee"
}

// Decorator Base Class
abstract class CoffeeDecorator(private val coffee: Coffee) : Coffee {
    override fun cost(): Double = coffee.cost()
    override fun description(): String = coffee.description()
}

// Concrete Decorators
class MilkDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = super.cost() + 0.5
    override fun description() = "${super.description()} + Milk"
}

class SugarDecorator(coffee: Coffee) : CoffeeDecorator(coffee) {
    override fun cost() = super.cost() + 0.2
    override fun description() = "${super.description()} + Sugar"
}

// Usage
fun main() {
    val basicCoffee: Coffee = BasicCoffee()
    val coffeeWithMilk: Coffee = MilkDecorator(basicCoffee)
    val coffeeWithMilkAndSugar: Coffee = SugarDecorator(coffeeWithMilk)

    println("${coffeeWithMilkAndSugar.description()} costs ${coffeeWithMilkAndSugar.cost()}")
    // Output: Basic Coffee + Milk + Sugar costs 2.7
}
