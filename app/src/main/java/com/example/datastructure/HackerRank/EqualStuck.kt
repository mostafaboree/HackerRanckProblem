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
 * Complete the 'equalStacks' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY h1
 *  2. INTEGER_ARRAY h2
 *  3. INTEGER_ARRAY h3
 */

    fun addAll(list:MutableList<Int>):MutableList<Int>{
        val newList=mutableListOf<Int>()
      for(i in list.size-1 downTo 0){
          newList.add(list[i])
      }
    return newList
}
fun equalStacks(h1: List<Int>, h2: List<Int>, h3: List<Int>): Int {
    val stack1 = h1.reversed().toMutableList()
    val stack2 = h2.reversed().toMutableList()
    val stack3 = h3.reversed().toMutableList()

    var sum1 = stack1.sum()
    var sum2 = stack2.sum()
    var sum3 = stack3.sum()

    while (true) {
        if (sum1 == sum2 && sum2 == sum3) return sum1

        if (sum1 >= sum2 && sum1 >= sum3) {
            sum1 -= stack1.removeAt(stack1.size - 1)
        } else if (sum2 >= sum1 && sum2 >= sum3) {
            sum2 -= stack2.removeAt(stack2.size - 1)
        } else if (sum3 >= sum1 && sum3 >= sum2) {
            sum3 -= stack3.removeAt(stack3.size - 1)
        }
    }
}

fun equalStacks(h1: Array<Int>, h2: Array<Int>, h3: Array<Int>): Int {
    // Write your code here
    val stuck1=h1.reversed().toMutableList()
    val stuck2=addAll(h2.toMutableList())
    val stuck3=addAll(h3.toMutableList())
    println(stuck1)
    println(stuck2)
    println(stuck3)

    var sum=0
    while(stuck1.sum()!=stuck2.sum()||stuck2.sum()!=stuck3.sum()){
      val max= listOf(stuck1,stuck2,stuck3).maxByOrNull { it.sum() }
       max.let {
           it?.removeAt(it.size-1)
       }
      //  println()
    }
    return stuck1.sum()




}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n1 = first_multiple_input[0].toInt()

    val n2 = first_multiple_input[1].toInt()

    val n3 = first_multiple_input[2].toInt()

    val h1 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val h2 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val h3 = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = equalStacks(h1, h2, h3)

    println(result)
}
