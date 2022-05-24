fun main() {
    val start = readln().toLong()
    val end = readln().toLong()
    var result = 1L
    for (num in start until end) {
        result *= num
    }
    println(result)
}