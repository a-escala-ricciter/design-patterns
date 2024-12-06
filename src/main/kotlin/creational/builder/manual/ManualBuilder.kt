package creational.builder.manual

import creational.builder.Builder
import creational.builder.Engine

class ManualBuilder: Builder {
    private var manual: Manual = Manual()

    override fun reset(): Builder = apply { manual = Manual() }

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

    fun build(): Manual = manual
}
