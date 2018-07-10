package com.bigbang.common

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())
    }

    @Test
    fun testBoolean() {
        getBoolean().yes {
            print("OK")
        }.otherwise {
            print("Otherwise")
        }
    }

    fun getBoolean() = true
}