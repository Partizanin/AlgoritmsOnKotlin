package sort

import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/**
 * Created by Partizanin on 24.07.2017 20:09:33.
 */
class MergeSortTest {

    @Test
    fun sort() {
        val ms = MergeSort()

        var tempList = (1..100).toList()
        tempList = tempList.shuffled()
        val numbers = tempList.toIntArray()

        ms.sort(numbers)

        (0 until numbers.size - 1)
                .filter { numbers[it] > numbers[it + 1] }
                .forEach { fail() }

        assertTrue(true)
    }

}