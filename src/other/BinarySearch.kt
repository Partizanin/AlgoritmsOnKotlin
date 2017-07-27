package other

/**
 * Created by Partizanin on 24.07.2017 17:15:23.
 */
fun main(args: Array<String>) {

}

class BinarySearch {
    fun search(numbers: List<Int>, searchValue: Int): Int {

        val size = numbers.size
        var low = 0
        var height = size - 1

        while (low <= height) {
            val mid = (low + height) / 2
            if (searchValue == numbers[mid]) {
                return mid
            } else if (searchValue > numbers[mid]) {
                low = mid + 1
            } else {
                height = mid - 1
            }
        }
        return 0
    }
}