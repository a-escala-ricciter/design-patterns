package org.example.creational.abstract_factory

import org.example.creational.abstract_factory.Style.*
import creational.abstract_factory.chair.Chair
import creational.abstract_factory.coffee_table.CoffeeTable
import creational.abstract_factory.factory.ArtDecoFactory
import org.example.creational.abstract_factory.factory.FurnitureFactory
import creational.abstract_factory.factory.ModernFactory
import creational.abstract_factory.factory.VictorianFactory
import creational.abstract_factory.sofa.Sofa

class Client(
    private val furnitureFactory: FurnitureFactory,
    private val chair: Chair = furnitureFactory.createChair(),
    private val sofa: Sofa = furnitureFactory.createSofa(),
    private val coffeeTable: CoffeeTable = furnitureFactory.createCoffeeTable()
) {
    fun sitOnChair() = chair.sitOn()
    fun sitOnSofa() = sofa.sitOn()
    fun putObjectOn() = coffeeTable.putObjectOn()
}

enum class Style {
    MODERN,
    VICTORIAN,
    ART_DECO
}

fun main() {
    val style: Style = MODERN //Change here to change the object creation

    val client = when(style) {
        MODERN -> Client(ModernFactory())
        VICTORIAN -> Client(VictorianFactory())
        ART_DECO -> Client(ArtDecoFactory())
    }

    client.sitOnChair()
    client.sitOnSofa()
    client.putObjectOn()
}
