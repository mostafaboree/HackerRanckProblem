package com.example.datastructure.HackerRank

import java.io.*
import java.lang.Math.absExact
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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'rotateLeft' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. INTEGER d
 *  2. INTEGER_ARRAY arr
 */

fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
   val rotated = Array<Int>(arr.size){0}
    arr.forEachIndexed { index, i ->
        if(index>=d){
        var shiftedIndex = abs(index-d)
       // println("$shiftedIndex + $index  , $i")
        rotated[shiftedIndex]=arr[index]}
        else{
            var shiftedIndex = arr.size-abs(index-d)
         //   println("negative $shiftedIndex + $index  , $i")

            rotated[shiftedIndex]=arr[index]
        }
    }

    return rotated

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = rotateLeft(d, arr)

    println(result.joinToString(" "))
}
