package lychrel

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LichrelTest {

    @Test
    fun facts() {
        isNotLychrel(1, 0, 1000)
    }

    private fun isNotLychrel(n: Int, iteration: Int, limit: Int) {
        assertEquals(iteration, Lychrel().convergesAtIteration(n, limit))
    }

}
