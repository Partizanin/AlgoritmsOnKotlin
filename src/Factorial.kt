/**
 * Created by Partizanin on 22.07.2017 15:27:32.
 */
class Factorial {
    fun factRecurs(num: Int): Int {
        if (num < 2) return 1
        return num * factRecurs(num - 1)
    }

    fun fact(num: Int): Int {
        var result = 1

        for (i in 1 until num) {
            result *= i + 1
        }
        return result
    }
}