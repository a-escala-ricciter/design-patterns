package creational.builder

interface Builder  {
    fun reset(): Builder
    fun seats(numberOfSeats: Int): Builder
    fun engine(engine: Engine): Builder
    fun tripComputer(hasTripComputer: Boolean): Builder
    fun gps(hasGps: Boolean): Builder
}
