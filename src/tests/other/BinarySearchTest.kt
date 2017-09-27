package other

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Partizanin on 24.07.2017 17:29:48.
 */
class BinarySearchTest {
    @Test
    fun bSearch() {
        val bs = BinarySearch()
        val t1 = System.currentTimeMillis()

        val maxValue = 1000
        val numbers = (0..maxValue).toList()
        println(System.currentTimeMillis() - t1)

        val searchValue = 12/*maxValue / 4*/
        val numIndex = bs.search(numbers, searchValue)

        println(System.currentTimeMillis() - t1)

        assertEquals(numbers[numIndex], searchValue)

    }

}