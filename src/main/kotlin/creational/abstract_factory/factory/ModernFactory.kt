package creational.abstract_factory.factory

import creational.abstract_factory.chair.Chair
import creational.abstract_factory.chair.ModernChair
import creational.abstract_factory.coffee_table.CoffeeTable
import creational.abstract_factory.coffee_table.ModernCoffeeTable
import creational.abstract_factory.sofa.ModernSofa
import creational.abstract_factory.sofa.Sofa
import org.example.creational.abstract_factory.factory.FurnitureFactory

class ModernFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ModernChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ModernCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ModernSofa()
    }
}