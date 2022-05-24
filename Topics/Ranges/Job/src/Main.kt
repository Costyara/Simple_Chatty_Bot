fun main() {
    val allowableAge = 18..59
    val age = readln().toInt()
    println(age in allowableAge)
}