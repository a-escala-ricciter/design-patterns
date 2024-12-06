package org.example.creational.abstract_factory.factory

import org.example.creational.abstract_factory.chair.Chair
import org.example.creational.abstract_factory.coffee_table.CoffeeTable
import org.example.creational.abstract_factory.sofa.Sofa

class ModernFactory : FurnitureFactory {
    override fun createChair(): Chair {
        TODO("Not yet implemented")
    }

    override fun createCoffeeTable(): CoffeeTable {
        TODO("Not yet implemented")
    }

    override fun createSofa(): Sofa {
        TODO("Not yet implemented")
    }
}