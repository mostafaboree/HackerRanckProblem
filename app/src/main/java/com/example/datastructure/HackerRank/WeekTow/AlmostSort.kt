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
 * Complete the 'almostSorted' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun almostSorted(arr: Array<Int>): Unit {
    // Write your code here
    var count = 0
    var list=mutableListOf<Int>()
for(i in 0 until arr.size-1){
    if(arr[i]>arr[i+1]){
        count+=2
        list.add(i)
    }}
    println(count)

    if(count==0){
        println("yes")
    }else if (count>=1){
        if(count in 1..2){
            println("yes")
            if(list[0]+1==list[1]){
                println("swap ${list[0]+1} ${list[1]+1}")
            }
            else{
                println("reverse ${list[0]+1} ${list.size+2}")
            }

    }else{
        println("revsere ${list[0]+1} + ${list.size+2}")
    }


    }



}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    almostSorted(arr)
}
