fun main() {

    val point = Point(2, 6)
    val point2 = Point(6, 3)

    println(point.toString())
    println(point.symmetricPoints())
    println(point.distance(point2))
    println(point.equals(point2))

    val transportFactory = TransportFactory()
    transportFactory.create()
}

