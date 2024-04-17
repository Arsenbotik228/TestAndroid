package com.myself223.testandroid

import java.util.Arrays
import java.util.Collections

class MyMath {
    fun add(a: Int, b: Int): Int {
        return a+b
    }
    fun getText(some: String): String {
        val array = some.split(" ").reversed()
        val reversedString = array.joinToString(" ")
        println(reversedString)
        return reversedString
    }

    /*fun getText(some: String): String {
        val array = some.split(" ").reversed()
        return array.joinToString(" ")
    }*/
    /*fun getText(some: String): String {

        val array = some.split(" ")
        Collections.reverse(Arrays.asList(array))
        return array.toString()
    }*/


    //
}