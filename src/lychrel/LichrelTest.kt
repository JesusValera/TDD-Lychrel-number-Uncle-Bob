package lychrel

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class LichrelTest {

    private val limit: Int = 1000

    @Test
    fun facts() {
        convergesAtIteration(1, 0)
        convergesAtIteration(2, 0)
        convergesAtIteration(10, 1)
        convergesAtIteration(11, 0)
    }

    private fun convergesAtIteration(n: Int, iteration: Int) {
        assertEquals(iteration, Lychrel().convergesAtIteration(n, limit))
    }

    @Test
    fun nonPalindromes() {
        isNotPalindrome(10)
        isNotPalindrome(12331)
        isNotPalindrome(1243321)
    }

    @Test
    fun palindromes() {
        isPalindrome(1)
        isPalindrome(11)
        isPalindrome(121)
        isPalindrome(12321)
        isPalindrome(1234321)
    }

    private fun isNotPalindrome(n: Int) {
        assertFalse(Lychrel().isPalindrome(n))
    }

    private fun isPalindrome(n: Int) {
        assertTrue(Lychrel().isPalindrome(n))
    }
}
