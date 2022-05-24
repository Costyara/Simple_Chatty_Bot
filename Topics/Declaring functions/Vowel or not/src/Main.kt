fun isVowel(letter: Char) = letter in "aeoiuAEOIU"

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}