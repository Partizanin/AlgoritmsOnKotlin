package other

/**
 * Created by Partizanin on 24.07.2017 18:36:24.
 */
class LinearSearch {
    fun search(numbers: List<Int>, searchValue: Int): Int {
        return numbers.firstOrNull { searchValue == it } ?: 0
    }
}