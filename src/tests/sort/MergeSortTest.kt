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

        ms.sort(tempList as ArrayList<Int>)

        (0 until tempList.size - 1)
                .filter { tempList[it] > tempList[it + 1] }
                .forEach { fail() }

        assertTrue(true)
    }

}