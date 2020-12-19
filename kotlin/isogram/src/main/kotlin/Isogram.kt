object Isogram {

    fun isIsogram(input: String): Boolean {
        return input
            .toLowerCase()
            .filter(Char::isLetter)
            .let {
                it.toSet().size == it.length
            }
    }
}
