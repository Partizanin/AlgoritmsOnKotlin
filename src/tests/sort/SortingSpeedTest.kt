package sort

import org.junit.Test


/**
 * Created by Partizanin on 25.07.2017 21:59:12.
 */
class SortingSpeedTest {
    @Test
    fun speedTest() {
        val bubbleSort = BubbleSort()
        val insertSort = InsertSort()
        val mergeSort = MergeSort()
        val selectionSort = SelectionSort()

        var list = (1..1000).toList()
        list = list.shuffled()

        var tempList = ArrayList<Int>(list)


        var t1 = System.currentTimeMillis()
        bubbleSort.sort(tempList)
        println("bubbleSort ${System.currentTimeMillis() - t1}")

        tempList = ArrayList(list)

        t1 = System.currentTimeMillis()
        insertSort.sort(tempList)
        println("insertSort ${System.currentTimeMillis() - t1}")


        tempList = ArrayList(list)


        t1 = System.currentTimeMillis()

        mergeSort.sort(tempList)

        println("mergeSort ${System.currentTimeMillis() - t1}")


        tempList = ArrayList(list)

        t1 = System.currentTimeMillis()

        selectionSort.sort(tempList)

        println("selectionSort ${System.currentTimeMillis() - t1}")


    }
}