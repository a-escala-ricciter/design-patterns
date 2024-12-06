package org.example.creational.factory_method

abstract class Creator {
    /**
     * If you think about it, this is the factory method.
     * The important thing to have in mind is that the creator
     * requires a method that returns a common interface, and this
     * given method is abstract, so each subclass can implement its
     * own creator.
     */
    abstract fun createDelivery(): Transport

    fun deliver(type: String) {
        val deliver = when(type) {
            "T" -> TruckCreator()
            "S" -> ShipCreator()
            else -> throw IllegalArgumentException("No valid argument \"type\" provided")
        }

        val delivery = deliver.createDelivery()
        delivery.deliver()
    }
}

class ShipCreator: Creator() {
    override fun createDelivery(): Transport = Ship()
}

class TruckCreator: Creator() {
    override fun createDelivery(): Transport = Truck()
}
