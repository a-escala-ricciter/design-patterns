package structural.composite.order

import java.math.BigDecimal

class Box(
    private val name: String
): OrderComponent {
    private val children: MutableList<OrderComponent> = mutableListOf()

    fun add(order: OrderComponent) {
        children.add(order)
    }

    fun remove(order: OrderComponent) {
        children.remove(order)
    }

    override fun display(indent: String) {
        println("$indent+ Box: $name")
        children.forEach { it.display("$indent  ") }
    }

    override fun getPrice(): BigDecimal {
        return children.sumOf { it.getPrice() }
    }
}
