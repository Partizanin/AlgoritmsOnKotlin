package math

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Created by Partizanin on 24.07.2017 13:04:20.
 */
class CaesarCipherTest {

    @Test
    fun encryptString() {
        val cc = CaesarCipher()
        assertEquals(cc.encryptString("hello, world"), "khoor, zruog")
        assertEquals(cc.encryptString("hello, world"), "khoor, zruog")


        assertEquals(cc.encryptString("HELLO, WORLD"), "KHOOR, ZRUOG")
        assertEquals(cc.decryptString("KHOOR, ZRUOG"), "HELLO, WORLD")

        assertEquals(cc.decryptString("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"), "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD")
        assertEquals(cc.encryptString("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD"), "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")
    }
}