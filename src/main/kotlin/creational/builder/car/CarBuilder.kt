package creational.builder.car

import creational.builder.Builder
import creational.builder.Engine

class CarBuilder: Builder {
    private var car: Car = Car()

    override fun reset(): Builder = apply { car = Car() }

    override fun seats(numberOfSeats: Int): Builder {
        TODO("Not yet implemented")
    }

    override fun engine(engine: Engine): Builder {
        TODO("Not yet implemented")
    }

    override fun tripComputer(hasTripComputer: Boolean): Builder {
        TODO("Not yet implemented")
    }

    override fun gps(hasGps: Boolean): Builder {
        TODO("Not yet implemented")
    }

    fun build(): Car = car
}
