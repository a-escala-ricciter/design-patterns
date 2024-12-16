package creational.factory_method

class Ship: Transport {
    override fun deliver() {
        println("Delivering it via Ship")
    }
}