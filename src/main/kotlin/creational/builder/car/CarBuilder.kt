package creational.builder.car

import creational.builder.Builder
import creational.builder.Engine

class CarBuilder: Builder {
    private var car: Car = Car()

    override fun reset(): Builder = apply { car = Car() }

    override fun seats(numberOfSeats: Int): Builder {
        // TODO
        return apply { }
    }

    override fun engine(engine: Engine): Builder {
        // TODO
        return apply { }
    }

    override fun tripComputer(hasTripComputer: Boolean): Builder {
        // TODO
        return apply { }
    }

    override fun gps(hasGps: Boolean): Builder {
        // TODO
        return apply { }
    }

    fun build(): Car = car
}
