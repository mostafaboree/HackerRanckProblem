package com.example.datastructure.HackerRank.WeekTow

import androidx.compose.ui.res.fontResource
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
 * Complete the 'cavityMap' function below.
 *
 * The function is expected to return a STRING_ARRAY.
 * The function accepts STRING_ARRAY grid as parameter.
 */

fun cavityMap(grid: Array<String>): Array<String> {
    // Write your code here
    grid.forEachIndexed { index, s ->
      for(i in 1..<s.length-1){
          if(s[i]>s[i-1] && s[i]>s[i+1]&&s[i]>s[0]){
              grid[index] = grid[index].replaceRange(i,i+1,"X")
          }

      }
        //println(s)


    }
    return grid

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val grid = Array<String>(n, { "" })
    for (i in 0 until n) {
        val gridItem = readLine()!!
        grid[i] = gridItem
    }

    val result = cavityMap(grid)

    println(result.joinToString("\n"))
}
