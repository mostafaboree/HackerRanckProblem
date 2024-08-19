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

// Complete the flatlandSpaceStations function below.
fun flatlandSpaceStations(n: Int, c: Array<Int>): Int {
    if (c.size ==n)
        return 0

var max=0
    for (i in 0 until n) {
        var min=n

        val new=mutableListOf<Int>()
        c.forEach {
          min=Math.min(min,Math.abs(it-i))
        }
       max=Math.max(max,min)
        }
return max

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nm = scan.nextLine().split(" ")

    val n = nm[0].trim().toInt()

    val m = nm[1].trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = flatlandSpaceStations(n, c)

    println(result)
}
