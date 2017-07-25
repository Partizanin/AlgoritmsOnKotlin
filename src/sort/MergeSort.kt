package sort


/**
 * Created by Partizanin on 24.07.2017 18:54:36.
 */
class MergeSort {
    private var numbers = ArrayList<Int>()
    private var tempArr = intArrayOf()
    private var num = 0

    fun sort(numbers: ArrayList<Int>) {
        this.numbers = numbers
        num = numbers.size
        tempArr = IntArray(num)
        mergeSort(0, num - 1)
    }

    private fun mergeSort(low: Int, high: Int) {
        if (low < high) {
            val middle = low + (high - low) / 2

            mergeSort(low, middle)

            mergeSort(middle + 1, high)

            merge(low, middle, high)
        }
    }

    private fun merge(low: Int, middle: Int, high: Int) {
        for (i in low..high) {
            tempArr[i] = numbers[i]
        }

        var i = low
        var j = middle + 1
        var k = low

        while (i <= middle && j <= high) {
            if (tempArr[i] <= tempArr[j]) {
                numbers[k] = tempArr[i]
                i++
            } else {
                numbers[k] = tempArr[j]
                j++
            }
            k++
        }

        while (i <= middle) {
            numbers[k] = tempArr[i]
            k++
            i++
        }
    }
}