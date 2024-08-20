package com.example.datastructure.HackerRank

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'strangeCounter' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER t as parameter.
 */


    fun strangeCounter(t: Int): Int {
        var cycleStart = 3L
        var time = t.toLong()

        while (time > cycleStart) {
            time -= cycleStart
            cycleStart *= 2
        }

        return (cycleStart - time + 1).toInt()
    }




fun main(args: Array<String>) {
    val t = readLine()!!.trim().toLong()

    val result = strangeCounter(t.toInt())

    println(result)
}
