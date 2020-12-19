object Pangram {

    fun isPangram(input: String): Boolean = input.map {it.toLowerCase()}.containsAll(('a'..'z').toList())
}
