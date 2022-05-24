import java.math.*
import kotlin.math.pow

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = readln().toDouble()
    val d = readln().toDouble()
    for (x in 0..1000) {
        if (a * x.toDouble().pow(3) + b * x.toDouble().pow(2) + c * x + d == 0.0) {
            println(x)
        }
    }
}