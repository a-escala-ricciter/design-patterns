package creational.abstract_factory.factory

import creational.abstract_factory.chair.ArtDecoChair
import creational.abstract_factory.chair.Chair
import creational.abstract_factory.coffee_table.ArtDecoCoffeeTable
import creational.abstract_factory.coffee_table.CoffeeTable
import creational.abstract_factory.sofa.ArtDecoSofa
import creational.abstract_factory.sofa.Sofa
import org.example.creational.abstract_factory.factory.FurnitureFactory

class ArtDecoFactory : FurnitureFactory {
    override fun createChair(): Chair {
        return ArtDecoChair()
    }

    override fun createCoffeeTable(): CoffeeTable {
        return ArtDecoCoffeeTable()
    }

    override fun createSofa(): Sofa {
        return ArtDecoSofa()
    }
}