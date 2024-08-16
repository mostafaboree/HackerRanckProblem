package com.example.datastructure.HackerRank

import java.math.BigInteger

fun kaprekarNumbers(p: Int, q: Int): Unit {
    // Write your code here
    var l:Int=0
    for(i in p..q){
        if(cheack(i.toLong())){
            print("$i ")
            l++
        }
    }
    if(l==0){
        print("INVALID RANGE")
    }

}
fun cheack(n:Long):Boolean{

    val x:Long=(n*n)
   // println(x)
    val x1=x.toString()
    val part1=x1.substring(0,x1.length/2).ifBlank { "0" }
    val sum2:String=x1.substring(x1.length/2).ifBlank { "0" }

    return part1.toLong()+sum2.toLong()==n


}

fun main(args: Array<String>) {
    val p = readLine()!!.trim().toInt()

    val q = readLine()!!.trim().toInt()

    kaprekarNumbers(p,q )
}
//1 9 45 55 99 297 703 999 2223 2728 4950 5050 7272 7777 9999 17344 22222 77778 82656 95121 99999