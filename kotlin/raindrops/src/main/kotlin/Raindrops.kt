object Raindrops {

    fun convert(n: Int): String {

        return buildString {
            append(n.getStringForFactor(3))
            append(n.getStringForFactor(5))
            append(n.getStringForFactor(7))
            if (isNullOrBlank())
                append(n)
        }

    }

    private fun Int.getStringForFactor(factor: Int): String {
        if (this % factor == 0) {
            return when (factor) {
                3 -> "Pling"
                5 -> "Plang"
                7 -> "Plong"
                else -> ""
            }
        }
        return ""
    }
}
