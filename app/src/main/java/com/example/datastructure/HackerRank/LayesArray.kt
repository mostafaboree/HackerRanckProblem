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
 * Complete the 'larrysArray' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY A as parameter.
 */

fun larrysArray(A: Array<Int>): String {
    // Write your code here

    val n = A.size
    val arr = A.copyOf()

    for (i in 0 until n - 2) {
        while (arr[i] > arr[i + 1] || arr[i] > arr[i + 2]) {
            rotate(arr, i)
            if (arr[i] < arr[i + 1] && arr[i] < arr[i + 2]) break
        }
    }

    return if (arr[n - 2] < arr[n - 1]) "YES" else "NO"
}

fun rotate(arr: Array<Int>, start: Int) {
    val temp = arr[start]
    arr[start] = arr[start + 1]
    arr[start + 1] = arr[start + 2]
    arr[start + 2] = temp
}



fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val A = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = larrysArray(A)

        println(result)
    }
}
