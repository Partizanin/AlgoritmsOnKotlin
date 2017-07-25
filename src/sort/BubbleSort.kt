package sort

/**
 * Created by Partizanin on 25.07.2017 21:24:27.
 */
class BubbleSort {
    fun sort(numbers: ArrayList<Int>) {
        for (i in numbers.size - 1 downTo 1) {
            for (j in 0 until i) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers.swap(j, j + 1)
                }

            }
        }
    }
}