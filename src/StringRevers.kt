/**
 * Created by Partizanin on 22.07.2017 14:55:47.
 */
class StringRevers {
    fun revers(string: String): String {
        var result = ""

        for (i in string.length - 1 downTo 0) {
            result += (string[i])
        }
        return result
    }
}