import abstractFactory.TransportTypes

interface Aircraft {
    fun fly()
}

class Boeing737 : Aircraft {
    override fun fly() {
        println("Fly Boeing737!")
    }
}

class Boeing777 : Aircraft {
    override fun fly() {
        println("Fly Boeing777!")
    }
}

class AircraftFactory {
    fun create(type: TransportTypes): Aircraft? {
        return when (type) {
            TransportTypes.Boeing737 -> Boeing737()
            TransportTypes.Boeing777 -> Boeing777()
            else -> null
        }
    }
}