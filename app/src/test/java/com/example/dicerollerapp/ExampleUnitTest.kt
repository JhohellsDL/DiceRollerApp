package com.example.dicerollerapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = MainActivity.Dice(4)
        val rollResult = dice.roll()
        assertTrue("estas en el rango",rollResult in 1..6)
    }
}