package creational.builder.manual

import creational.builder.Builder
import creational.builder.Engine

class ManualBuilder: Builder {
    private var manual: Manual = Manual()

    override fun reset(): Builder = apply { manual = Manual() }

    override fun seats(numberOfSeats: Int): Builder {
        // TODO
        return apply {}
    }

    override fun engine(engine: Engine): Builder {
        // TODO
        return apply {}
    }

    override fun tripComputer(hasTripComputer: Boolean): Builder {
        // TODO
        return apply {}
    }

    override fun gps(hasGps: Boolean): Builder {
        // TODO
        return apply {}
    }

    fun build(): Manual = manual
}
