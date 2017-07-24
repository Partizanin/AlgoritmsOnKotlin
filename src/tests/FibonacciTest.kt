import math.Fibonacci
import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Partizanin on 24.07.2017 01:20:04.
 */
class FibonacciTest {
    @Test
    fun fibonacciTest() {
        val fib = Fibonacci()

        assertEquals(fib.fib(0), 0)
        assertEquals(fib.fib(1), 1)
        assertEquals(fib.fib(2), 1)
        assertEquals(fib.fib(3), 2)
        assertEquals(fib.fib(4), 3)
        assertEquals(fib.fib(5), 5)
        assertEquals(fib.fib(6), 8)
        assertEquals(fib.fib(7), 13)
        assertEquals(fib.fib(8), 21)
        assertEquals(fib.fib(9), 34)
        assertEquals(fib.fib(10), 55)

    }

}