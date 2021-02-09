fun main(args: Array<String>) {
    val sentence = "its on friday"
    val reversed = reverse(sentence)
    println("reversed sentence: $reversed")
}
fun reverse (sentence: String): String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring (1)) + sentence [0]
}