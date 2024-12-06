package org.example.creational.abstract_factory.factory

import org.example.creational.abstract_factory.chair.Chair
import org.example.creational.abstract_factory.coffee_table.CoffeeTable
import org.example.creational.abstract_factory.sofa.Sofa

interface FurnitureFactory {
    fun createChair(): Chair
    fun createCoffeeTable(): CoffeeTable
    fun createSofa(): Sofa
}
