package other

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Created by Partizanin on 27.07.2017 22:56:43.
 */
class SearchSpeedTest {
    @Test
    fun searchTest() {
        val bs = BinarySearch()
        val ls = LinearSearch()
        val list = (1..9999999).toList()
        val searchedIndex = (list.size / 4) + list.size / 2
        val searchedNumber = list[searchedIndex]


        var time = System.currentTimeMillis()
        var searchResult = bs.search(list, searchedNumber)
        println("binary search: ${System.currentTimeMillis() - time}")

        assertEquals(searchResult, searchedIndex)
        assertEquals(list[searchResult], list[searchedIndex])



        time = System.currentTimeMillis()
        searchResult = ls.search(list, searchedNumber)
        println("linear search: ${System.currentTimeMillis() - time}")


        assertEquals(searchResult, searchedIndex)
        assertEquals(list[searchResult], list[searchedIndex])


    }
}