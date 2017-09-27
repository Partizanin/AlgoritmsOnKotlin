package other

import org.junit.Assert.assertEquals

/**
 * Created by Partizanin on 22.07.2017 15:03:05.
 */
class StringReversTest {


    @org.junit.Test
    fun revers() {
        val stringRevers = StringRevers()
        assertEquals(stringRevers.revers("12"), "21")
        assertEquals(stringRevers.revers("123"), "321")
        assertEquals(stringRevers.revers("1234"), "4321")
        assertEquals(stringRevers.revers("12345"), "54321")
        assertEquals(stringRevers.revers("123456"), "654321")
        assertEquals(stringRevers.revers("1234567"), "7654321")
        assertEquals(stringRevers.revers("12345678"), "87654321")
        assertEquals(stringRevers.revers("123456789"), "987654321")
        assertEquals(stringRevers.revers("12345678910"), "01987654321")

        assertEquals(stringRevers.revers("ab"), "ba")
        assertEquals(stringRevers.revers("abc"), "cba")
        assertEquals(stringRevers.revers("abcd"), "dcba")
        assertEquals(stringRevers.revers("abcde"), "edcba")
        assertEquals(stringRevers.revers("abcdef"), "fedcba")
        assertEquals(stringRevers.revers("abcdefg"), "gfedcba")
        assertEquals(stringRevers.revers("abcdefgh"), "hgfedcba")
        assertEquals(stringRevers.revers("abcdefghi"), "ihgfedcba")
        assertEquals(stringRevers.revers("abcdefghij"), "jihgfedcba")

        assertEquals(stringRevers.revers("hello world"), "dlrow olleh")
    }

}