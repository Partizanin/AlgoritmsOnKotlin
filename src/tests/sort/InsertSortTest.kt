package sort

import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/**
 * Created by Partizanin on 25.07.2017 20:09:36.
 */
class InsertSortTest {
    @Test
    fun sort() {
        val insertSort = InsertSort()
        var list = (1..999).toList()
        list = list.shuffled()

        insertSort.sort(list as ArrayList<Int>)

        (0 until list.size - 1)
                .filter { list[it] > list[it + 1] }
                .forEach { fail() }
        assertTrue(true)

    }

}