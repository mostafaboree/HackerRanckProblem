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
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun lonelyinteger(a: Array<Int>): Int {

        var result = 0
        for (num in a) {
            result = result xor num
            println(result)
        }
        return result


}

fun main(args: Array<String>) {
    val n =7

    val a = arrayOf(1,2,3,4,3,2,1)

    val result = lonelyinteger(a)

    println(result)
}
