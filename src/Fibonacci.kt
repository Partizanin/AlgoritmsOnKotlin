/**
 * Created by Partizanin on 24.07.2017 01:14:33.
 */
class Fibonacci {
    fun fib(num: Int): Int {
        when (num) {
            0 -> return 0
            1 -> return 1
        }

        return fib(num - 1) + fib(num - 2)
    }

}