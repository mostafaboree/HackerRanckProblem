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
 * Complete the 'biggerIsGreater' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING w as parameter.
 */

fun biggerIsGreater(w: String): String {
    // Write your code here
    val element = w.filter { it>w.first() }.minOrNull()
    if(element==null) return "no answer"
    val index = w.indexOf(element)
    val s=w.toCharArray()
    s[0]=s[index]
    s[index]=w.first()
    return String(s)

}

/*fun main(args: Array<String>) {
    val T = readLine()!!.trim().toInt()

    for (TItr in 1..T) {
        val w = readLine()!!

        val result = biggerIsGreater(w)

        println(result)
    }
}*/
fun permute(str: String, l: Int, r: Int) {
    if (l == r) {
        println(str)
    } else {
        for (i in l..r) {
            val swapped = str.swap(l, i)
            permute(swapped, l + 1, r)
        }
    }
}

fun String.swap(i: Int, j: Int): String {
    val charArray = this.toCharArray()
    val temp = charArray[i]
    charArray[i] = charArray[j]
    charArray[j] = temp
    return String(charArray)
}

fun main() {
    val str = "ABCD"
    val n = str.length
    permute(str, 0, n - 1)
}