package creational.abstract_factory.factory

import creational.abstract_factory.chair.Chair
import creational.abstract_factory.chair.VictorianChair
import creational.abstract_factory.coffee_table.CoffeeTable
import creational.abstract_factory.coffee_table.VictorianCoffeeTable
import creational.abstract_factory.sofa.Sofa
import creational.abstract_factory.sofa.VictorianSofa
import org.example.creational.abstract_factory.factory.FurnitureFactory

class VictorianFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return VictorianChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return VictorianCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return VictorianSofa()
    }
}