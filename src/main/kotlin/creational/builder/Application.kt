package creational.builder

import creational.builder.car.Car
import creational.builder.car.CarBuilder
import creational.builder.manual.Manual
import creational.builder.manual.ManualBuilder

class Application {
    fun makeCar() {
        val director = Director()
        val car: Car = (director.constructSUVCar(CarBuilder()) as CarBuilder).build()
        val manual: Manual = (director.constructSUVCar(ManualBuilder()) as ManualBuilder).build()

        println("$car $manual")
    }
}
