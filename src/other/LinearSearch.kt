package other

/**
 * Created by Partizanin on 24.07.2017 18:36:24.
 */
class LinearSearch {
    fun search(numbers: List<Int>, searchValue: Int): Int {
        for (i in 0..numbers.size) {
            if (searchValue == numbers[i]) {
                return i
            }
        }
        return 0
    }
}