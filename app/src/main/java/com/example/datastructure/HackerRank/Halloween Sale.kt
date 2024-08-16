package com.example.datastructure.HackerRank

fun howManyGames(p: Int, d: Int, m: Int, s: Int): Int {
    // Return the number of games you can buy
    var p = p
    var s = s
    var count = 0
    while (s>=m && s>=p) {
        s-=p
        count++
       p=Math.max(p-d,m)

    }
    return count

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val p = first_multiple_input[0].toInt()

    val d = first_multiple_input[1].toInt()

    val m = first_multiple_input[2].toInt()

    val s = first_multiple_input[3].toInt()

    val answer = howManyGames(p, d, m, s)

    println(answer)
}
