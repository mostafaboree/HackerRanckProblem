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
 * Complete the 'stringAnagram' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY dictionary
 *  2. STRING_ARRAY query
 */
fun mostActive(customers: List<String>): Array<String> {
    val tradeCounts = customers.groupingBy { it }.eachCount()
    val totalTrades = customers.size.toDouble()

    return (tradeCounts.filterValues { it.toDouble() / totalTrades >= 0.05 }
        .mapKeys { it.key }
        .toList()
        .sortedBy { it.first }
        .map { it.first }).toTypedArray() as Array<String>
}
fun cheackAnagram(s:String,t:String):Boolean{
    var i=0
    return (s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray()))
}
fun stringAnagram(dictionary: Array<String>, query: Array<String>): Array<Int> {
    // Write your code here
    var count = Array<Int>(query.size,{0})
    var i = 0
query.forEach {q->
    dictionary.forEach {d->
        if(cheackAnagram(q,d)){
            count[i]++
        }
    }
    i++
}
return count
}

fun main(args: Array<String>) {
    val dictionaryCount = readLine()!!.trim().toInt()

    val dictionary = Array<String>(dictionaryCount, { "" })
    for (i in 0 until dictionaryCount) {
        val dictionaryItem = readLine()!!
        dictionary[i] = dictionaryItem
    }

    val queryCount = readLine()!!.trim().toInt()

    val query = Array<String>(queryCount, { "" })
    for (i in 0 until queryCount) {
        val queryItem = readLine()!!
        query[i] = queryItem
    }

    val result = stringAnagram(dictionary, query)

    println(result.joinToString("\n"))
}
