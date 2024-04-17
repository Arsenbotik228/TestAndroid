package com.myself223.testandroid

import androidx.core.content.res.TypedArrayUtils.getText
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {
    private var math: MyMath? = null

    @Before
    fun setUp() {
        math = MyMath()
        println("Before")
    }

    @Test
    fun simpleAddCase() {
        assertEquals(15, math?.add(5, 10))
        println("Simple Add Case")
    }

    @Test
    fun reversedTextCase() {
        val reversedText = math?.getText("Hello world")
        println(reversedText)
    }
   /* fun reversedTextCase() {
        assertEquals("world Hello", math?.getText("Hello world"))
        println("Reversed Text Case")
    }*/

    @After
    fun tearDown() {
        math = null
        println("After")
    }
}