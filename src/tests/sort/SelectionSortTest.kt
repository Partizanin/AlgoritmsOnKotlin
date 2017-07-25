package sort

import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Test

/**
 * Created by Partizanin on 25.07.2017 21:09:31.
 */
class SelectionSortTest {
    @Test
    fun sort() {
        val ss = SelectionSort()
        var list = (1..99999).toList()
        list = list.shuffled()

        ss.sort(list as ArrayList<Int>)

        for (i in 0 until list.size - 1) {
            if (list[i] > list[i + 1]) {
                fail()
            }
        }
        assertTrue(true)
    }

}