package com.example.datastructure.HackerRank

fun minimumDistances(a: Array<Int>): Int {

    var min = Int.MIN_VALUE
    val map= mutableMapOf<Int,Int>()
    val list= mutableListOf<Int>()


   map.forEach { (t, u) ->
       }
    a.forEachIndexed { index, i ->
        for (j in index+1 until a.size-1) {
            if (i == a[j]) {
                //min = Math.min(min, j - index)
                list.add(j-index)
            }

    }
    }

return list.min()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = minimumDistances(a)

    println(result)
}
