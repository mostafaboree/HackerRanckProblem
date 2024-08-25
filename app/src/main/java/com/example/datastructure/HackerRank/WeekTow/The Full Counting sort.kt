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
 * Complete the 'countSort' function below.
 *
 * The function accepts 2D_STRING_ARRAY arr as parameter.
 */

/*
fun countSort(arr: Array<Array<String>>): Unit {
    // Write your code here
    val left=arr.size/2
    val x= 300000
    val w=x/2
    println(w)
    var map = mutableMapOf<String,ArrayList<String>>()
    for(i in arr.indices){
        if(i<left){
            if(map.containsKey(arr[i][0])){
                var list = map.get(arr[i][0])
                list?.add("-")
                map.put(arr[i][0],list!!)
            }else{
                var list = ArrayList<String>()
                list.add("-")
                map.put(arr[i][0],list)
            }

        }else{
        if(map.containsKey(arr[i][0])){
            var list = map.get(arr[i][0])
            list?.add(arr[i][1])
            map.put(arr[i][0],list!!)
    }else{
        var list = ArrayList<String>()
        list.add(arr[i][1])
        map.put(arr[i][0],list)
    }}

}
    map = map.toSortedMap()
    map.forEach { t, u ->
        print(u.joinToString(" ")).also { print(" ") }
    }

}
*/
fun countSort(arr: Array<Array<String>>): Unit {
    val left = arr.size / 2
    val map = mutableMapOf<Int, MutableList<String>>()

    for (i in arr.indices) {
        val key = arr[i][0].toInt()
        val value = if (i < left) "-" else arr[i][1]
        map.getOrPut(key) { mutableListOf() }.add(value)
    }

    val sortedKeys = map.keys.sorted()
    val result = StringBuilder()

    for (key in sortedKeys) {
        result.append(map[key]?.joinToString(" ") ?: "").append(" ")
    }

    println(result.toString().trim())
}


fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<String>>(n, { Array<String>(2, { "" }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").toTypedArray()
    }

    countSort(arr)
}
