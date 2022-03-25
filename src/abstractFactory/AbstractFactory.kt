import abstractFactory.TransportTypes

abstract class AbstractFactory {

    abstract val car: Car?

    abstract val aircraft: Aircraft?

    fun create() {
        car?.drive()
        aircraft?.fly()
    }

}

class TransportFactory : AbstractFactory() {
    override val car: Car? = CarFactory().create(TransportTypes.Audi)
    override val aircraft: Aircraft? = AircraftFactory().create(TransportTypes.Boeing777)

}