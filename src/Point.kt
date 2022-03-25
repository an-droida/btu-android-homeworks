import kotlin.math.sqrt

data class Point(private val x: Int, private val y: Int) {

    override fun toString(): String {
        return "($x, $y)"
    }

    fun symmetricPoints(): Point {
        return Point(-x, -y)
    }

    fun distance(point: Point): Double {
        return sqrt((point.x - x) * (point.x - x) + (point.y - y) * (point.y - y).toDouble())
    }
}