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
import kotlin.math.max
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'almostSorted' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */
fun help(arr:Array<Int>):Int{
    for(i in 0 until arr.size-1){

        if(arr[i]>arr[i+1]){
        //    println("${arr[i]} ${i}")
            return arr[i]
            break
        }
    }
    return -1
}
fun almostSorted(arr: Array<Int>): Unit {
    // Write your code here
    var list = mutableListOf<Int>()
    if (help(arr) == -1) {
        println("yes")
    } else {
        var x = help(arr)
        var y = arr.indexOf(x)
        for (i in y until arr.size) {
            if (arr[i] <= x) {
                list.add(i)
            }

        }
        if (list.size == 2) {
            println("yes")
            println("swap ${list[0] + 1} ${list[1] + 1}")
        } else {
            if (arr[list[list.size - 1]] < arr[list[list.size - 2]]) {
                if (arr[list[list.size - 3]] < arr[list[list.size - 2]]) {
                    println("yes")
                    println("swap ${list[0] + 1} ${list[list.size - 1] + 1}")
                } else {
                    println("yes")
                    println("reverse ${list[0] + 1} ${list[list.size - 1] + 1}")
                }
            }
            //  println(list)

            else {

                println("no")
            }

        }


    }





}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    almostSorted(arr)
}
