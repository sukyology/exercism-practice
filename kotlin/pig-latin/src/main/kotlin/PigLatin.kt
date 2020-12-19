object PigLatin {

    fun translate(phrase: String): String {
        return phrase.split(" ").joinToString(" ") {
            val suffix = "ay"
            val pivotPoint = getPivotPoint(it)
            it.substring(IntRange(pivotPoint, it.length - 1)) + it.substring(
                IntRange(
                    0,
                    pivotPoint - 1
                )
            ) + suffix
        }

    }

    fun getPivotPoint(og: String): Int {

        if (og.first().isVowel())
            return 0
        if (og.startsWith("xr") || og.startsWith("yt"))
            return 0
        else {
            var index = 1
            while (index < og.length - 1) {
                if (og[index] == 'u' && og[index - 1] == 'q')
                    return index + 1
                if (og[index].isVowel() || og[index] == 'y')
                    return index
                else
                    index++
            }
            return index
        }
    }

    private fun Char.isVowel(): Boolean {
        return when (this) {
            'a', 'e', 'i', 'o', 'u' -> true
            else -> false
        }
    }
}

