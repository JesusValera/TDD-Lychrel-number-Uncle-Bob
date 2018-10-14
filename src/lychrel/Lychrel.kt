package lychrel

class Lychrel {

    fun convergesAtIteration(n: Int, limit: Int): Int {
        return if (isPalindrome(n))
            0
        else
            1
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
