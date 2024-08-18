package com.example.datastructure.HackerRank
/*
  var move=0
        if (stackA.last() > stackB.last()){
          move=stackB.last()
            stackB.removeLast()

        }else{
            move=stackA.last()
            stackA.removeLast()
    }
        println(stackC)
*/
fun twoStacks(maxSum: Int, a: Array<Int>, b: Array<Int>): Int {
    // Write your code here

    val stackA = a.reversed().toMutableList()
    val stackB = b.reversed().toMutableList()
    val stackC = mutableListOf<Int>()
    while (stackA.isNotEmpty() ||stackB.isNotEmpty() && stackC.sum() < maxSum){

        var move=0

        while ( stackA.isEmpty() || stackB.last() <= stackA.last()){
            move=stackB.last()
            stackB.removeLast()
            if (stackB.isEmpty() || stackC.sum() + move > maxSum)
                break
            stackC.add(move)
            println(stackB)

        }
        while ( stackB.isEmpty()|| stackA.last() <= stackB.last()){
            move=stackA.last()
            stackA.removeLast()
            if (stackA.isEmpty() ||stackC.sum() + move > maxSum)
                break
            stackC.add(move)
            println(stackA)
        }




        println(stackC)}
    return stackC.size
}

fun main(args: Array<String>) {
    val g = readLine()!!.trim().toInt()

    for (gItr in 1..g) {
        val first_multiple_input = readLine()!!.trimEnd().split(" ")

        val n = first_multiple_input[0].toInt()

        val m = first_multiple_input[1].toInt()

        val maxSum = first_multiple_input[2].toInt()

        val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val b = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = twoStacks(maxSum, a, b)

        println(result)
    }
}