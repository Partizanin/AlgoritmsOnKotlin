package sort

/**
 * Created by Partizanin on 25.07.2017 21:01:05.
 */
class SelectionSort {
    fun sort(numbers: ArrayList<Int>) {
        for (i in 0 until numbers.size) {
            var minIndex = i
            for (j in minIndex + 1 until numbers.size) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j
                }
            }
            numbers.swap(i, minIndex)
        }

    }
}