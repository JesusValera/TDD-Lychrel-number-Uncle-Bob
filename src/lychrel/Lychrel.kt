package lychrel

import java.math.BigInteger

class Lychrel {

    fun convergesAtIteration(n: Int, limit: Int): Int {
        return converge(BigInteger.valueOf(n.toLong()), 0, limit)
    }

    private fun converge(n: BigInteger, iteration: Int, limit: Int): Int {
        return if (!isPalindrome(n) && iteration < limit)
            converge(n.add(reverse(n)), iteration + 1, limit)
        else
            iteration
    }

    fun reverse(n: BigInteger): BigInteger {
        val nDigits: CharArray = n.toString().toCharArray()
        val rDigits = CharArray(nDigits.size)
        val lastIndex = nDigits.size - 1

        for (i in 0 until nDigits.size) {
            rDigits[i] = nDigits[lastIndex - i]
        }

        return String(rDigits).toBigInteger()
    }

    fun isPalindrome(n: BigInteger): Boolean {
        val digits = n.toString()
        val lastIndex = digits.length - 1

        for (i in 0 until digits.length)
            if (digits[i] != digits[lastIndex - i])
                return false

        return true
    }

}
