package com.example.datastructure.HackerRank

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    // Write your code here
    return 1

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}
