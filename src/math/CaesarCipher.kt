package math

/**
 * Created by Partizanin on 24.07.2017 12:45:52.
 */
fun main(args: Array<String>) {
    var cc = CaesarCipher()
    println(cc.decryptString("THE"))
}

class CaesarCipher {

    private fun encrypt(c: Char): Char {
        return getEncryptCode(c).toChar()
    }

    private fun decrypt(c: Char): Char {
        return getDecryptCode(c).toChar()

    }

    private fun getEncryptCode(c: Char): Int {
        var result = 0

        val charByteCode = c.toByte()

        if (charByteCode in 65..90) {
            result = charByteCode + 3

            if (result <= 90) {

                return result

            } else {
                return 64 + (result - 90)

            }

        } else if (charByteCode in 97..122) {
            result = charByteCode + 3

            if (result <= 122) {

                return result

            } else {

                return 96 + (result - 122)
            }
        }
        return result
    }

    private fun getDecryptCode(c: Char): Int {
        var result = 0

        val charByteCode = c.toByte()

        if (charByteCode in 65..90) {
            result = charByteCode - 3

            if (result >= 65) {

                return result

            } else {
                return 91 - (65 - result)

            }

        } else if (charByteCode in 97..122) {
            result = charByteCode - 3

            if (result >= 97) {

                return result

            } else {
                return 123 - (97 - result)

            }
        }
        return result

    }

    fun encryptString(string: String): String {
        val result = StringBuilder()
        for (c in string) {
            val charByteCode = c.toByte()

            if (charByteCode in 65..90 || charByteCode in 97..122) {
                result.append(encrypt(c))
            } else {
                result.append(c)
            }
        }
        return result.toString()
    }

    fun decryptString(string: String): String {
        val result = StringBuilder()
        for (c in string) {
            val charByteCode = c.toByte()

            if (charByteCode in 65..90 || charByteCode in 97..122) {
                result.append(decrypt(c))
            } else {
                result.append(c)
            }
        }
        return result.toString()
    }
}