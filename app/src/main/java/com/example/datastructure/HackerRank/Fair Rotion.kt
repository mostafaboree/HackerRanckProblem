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
 * Complete the 'fairRations' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY B as parameter.
 */
fun isEven(arr: Array<Int>): Boolean {
    return arr.all { it % 2 == 0 }
}
fun fairRations(B: Array<Int>): String {
    var loavesDistributed = 0

    for (i in 0 until B.size - 1) {
        if (B[i] % 2 != 0) {
            B[i]++
            B[i + 1]++
            loavesDistributed += 2
        }
    }

    return if (B.last() % 2 == 0) {
        loavesDistributed.toString()
    } else {
        "NO"
    }
}

/*fun fairRations(B: Array<Int>): String {
    // Write your code here
    var count = 0

 for (i in 1..B.size-2) {
        if (B[i] % 2 == 0 && B[i + 1] % 2 != 0 &&B[i - 1] % 2 != 0 ) {
            B[i + 1] += 1
            B[i] += 1
            count += 2
            println(B.toList())
        }else if (B[i] % 2 != 0 && B[i + 1] % 2 != 0) {
            B[i + 1] += 1
            B[i] += 1
            count += 2
            println(B.toList())
        }


    }
    if (isEven(B)) {
            return count.toString()
        }
        if (B.sum() % 2 != 0) {
            return "NO"
        }

    return count.toString()

}*/

  fun main(args: Array<String>) {
    val N = readLine()!!.trim().toInt()

    val B = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = fairRations(B)

    println(result)
}
