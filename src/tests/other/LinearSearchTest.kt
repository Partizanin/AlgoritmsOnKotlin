package other

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Partizanin on 24.07.2017 18:37:28.
 */
class LinearSearchTest {
    @Test
    fun search() {
        val search = LinearSearch()

        var searchValue = 12
        val listSize = 99999
        val numbers = (0..listSize).toList()
        assertEquals(search.search(numbers, searchValue), searchValue)
        searchValue = 5
        assertEquals(search.search(numbers, searchValue), searchValue)
        searchValue = listSize / 2
        assertEquals(search.search(numbers, searchValue), searchValue)
    }

}