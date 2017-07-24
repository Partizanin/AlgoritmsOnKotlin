package math

import org.junit.Test

import org.junit.Assert.*

/**
 * Created by Partizanin on 24.07.2017 17:29:48.
 */
class BinarySearchTest {
    @Test
    fun bSearch() {
        val bs = BinarySearch()
        val t1 = System.currentTimeMillis()

        val maxValue = 9999999
        val numbers = (0..maxValue).toList()
        println(System.currentTimeMillis() - t1)

        val searchValue = maxValue / 4
        val numIndex = bs.bSearch(numbers, searchValue)

        println(System.currentTimeMillis() - t1)

        assertEquals(numbers[numIndex], searchValue)

    }

}