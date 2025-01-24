package structural.composite.order

import java.math.BigDecimal

fun main() {

    // Products
    val product1 = Product(name = "Necklace", price = BigDecimal(10.0))
    val product2 = Product(name = "Ring", price = BigDecimal(5.0))
    val product3 = Product(name = "Necklace 2", price = BigDecimal(5.0))

    val product4 = Product(name = "Fridge", price = BigDecimal(350.0))

    val product5 = Product(name = "Broccoli", price = BigDecimal(1.0))
    val product6 = Product(name = "Beans", price = BigDecimal(1.0))

    // Organized in Boxes
    val mainBox = Box("Main Box")
    mainBox.add(product5)
    mainBox.add(product6)

    val box1 = Box("Box 1")
    box1.add(product1)
    box1.add(product2)

    val box2 = Box("Box 2")
    box2.add(product3)
    box2.add(box1)

    val box3 = Box("Box 3")
    box3.add(product4)

    mainBox.add(box2)
    mainBox.add(box3)

    // Display structure and calculate total size
    println("File System Structure:")
    mainBox.display()
    println("\nTotal Size: ${mainBox.getPrice()} EUR")
}
