package com.example.datastructure.HackerRank.WeekTow

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
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    // Write your code here
        val frequency = IntArray(k) { 0 }

        for (num in s) {
            frequency[num % k]++
        }

        var result = 0
        if (k == 1) {
            result = 1
        } else if (k == 2) {
            result = maxOf(frequency[0], frequency[1])
        } else {
            for (i in 1 until k / 2) {
                result += maxOf(frequency[i], frequency[k - i])
            }
            result += maxOf(frequency[0], 1)
        }

        return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n =9

    val k = 3

    val s = arrayOf(9,10,2,3,4,5,6,7,8)

    val result = nonDivisibleSubset(k, s)

    println(result)
}
