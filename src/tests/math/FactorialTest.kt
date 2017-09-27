package math

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Partizanin on 22.07.2017 15:28:21.
 */
class FactorialTest {
    @Test
    fun fact() {
        val fact = Factorial()
        assertEquals(fact.fact(0), 1)
        assertEquals(fact.fact(1), 1)
        assertEquals(fact.fact(2), 2)
        assertEquals(fact.fact(3), 6)
        assertEquals(fact.fact(4), 24)
        assertEquals(fact.fact(5), 120)
        assertEquals(fact.fact(6), 720)
        assertEquals(fact.fact(7), 5040)
        assertEquals(fact.fact(8), 40320)
        assertEquals(fact.fact(9), 362880)
        assertEquals(fact.fact(10), 3628800)
    }

    @Test
    fun factRecursive() {
        val fact = Factorial()
        assertEquals(fact.factRecurs(0), 1)
        assertEquals(fact.factRecurs(1), 1)
        assertEquals(fact.factRecurs(2), 2)
        assertEquals(fact.factRecurs(3), 6)
        assertEquals(fact.factRecurs(4), 24)
        assertEquals(fact.factRecurs(5), 120)
        assertEquals(fact.factRecurs(6), 720)
        assertEquals(fact.factRecurs(7), 5040)
        assertEquals(fact.factRecurs(8), 40320)
        assertEquals(fact.factRecurs(9), 362880)
        assertEquals(fact.factRecurs(10), 3628800)
    }

}