package sort

import org.junit.Test
import kotlin.test.assertTrue
import kotlin.test.fail

/**
 * Created by Partizanin on 25.07.2017 21:37:59.
 */
class BubbleSortTest {
    @Test
    fun bubbleSort() {
        val bs = BubbleSort()
        var list = (1..99999).toList()
        list = list.shuffled()
        bs.sort(list as ArrayList<Int>)

        (0 until list.size - 1).filter { list[it] > list[it + 1] }.forEach {
            fail()
        }
        assertTrue { true }


    }

}