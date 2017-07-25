package sort

/**
 * Created by Partizanin on 25.07.2017 20:01:41.
 */
class InsertSort {
    fun sort(numbers: ArrayList<Int>) {
        for (i in 1..numbers.size) {
            for (j in 1 until numbers.size) {
                while (numbers[j - 1] > numbers[j]) {
                    numbers.swap(j, j - 1)
                }
            }

        }
    }
}

fun <E> java.util.ArrayList<E>.swap(index1: Int, index2: Int) {
    val tempValue = get(index1)
    set(index1, get(index2))
    set(index2, tempValue)
}
