package structural.composite.order

import java.math.BigDecimal

class Product(
    private val name: String,
    private val price: BigDecimal
): OrderComponent {

    override fun display(indent: String) {
        println("$indent- Product: $name. Price: $price")
    }

    override fun getPrice(): BigDecimal {
        return price
    }
}
