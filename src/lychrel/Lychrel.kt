package lychrel

class Lychrel {

    fun convergesAtIteration(n: Int, limit: Int): Int {
        if (isPalindrome(n))
            return 0

        val r = reverse(n)
        val sum = r + n

        if (!isPalindrome(sum))
            return 2

        return 1
    }

    fun reverse(n: Int): Int {
        val nDigits: CharArray = n.toString().toCharArray()
        val rDigits = CharArray(nDigits.size)
        val lastIndex = nDigits.size - 1

        for (i in 0 until nDigits.size) {
            rDigits[i] = nDigits[lastIndex - i]
        }

        return String(rDigits).toInt()
    }

    fun isPalindrome(n: Int): Boolean {
        val digits = n.toString()
        val lastIndex = digits.length - 1

        for (i in 0 until digits.length)
            if (digits[i] != digits[lastIndex - i])
                return false

        return true
    }

}
