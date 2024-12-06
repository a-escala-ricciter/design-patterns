package creational.builder

/**
 * The existence of a Director is optional
 */
class Director {

    fun constructSportCar(builder: Builder): Builder = commonalities(builder)
        .engine(SportEngine())
        .seats(2)

    fun constructSUVCar(builder: Builder): Builder = commonalities(builder)
        .engine(SUVEngine())
        .seats(5)

    /**
     * This could be moved to the Builder itself, if there wasn't a Director class, for example
     */
    private fun commonalities(builder: Builder) = builder
        .gps(true)
        .tripComputer(true)
}
