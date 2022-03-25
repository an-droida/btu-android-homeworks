import abstractFactory.TransportTypes

interface Car {
    fun drive()
}

class Audi : Car {
    override fun drive() {
        println("Drive Audi!")
    }
}

class Maserati : Car {
    override fun drive() {
        println("Drive Maserati!")
    }
}

class CarFactory {
    fun create(type: TransportTypes): Car? {
        return when (type) {
            TransportTypes.Audi -> Audi()
            TransportTypes.Maserati -> Maserati()
            else -> null
        }
    }
}
