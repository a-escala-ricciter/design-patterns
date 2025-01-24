package structural.composite.order

import java.math.BigDecimal

interface OrderComponent {
    fun display(indent: String = "")
    fun getPrice(): BigDecimal
}
