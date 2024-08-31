package com.example.datastructure.LeetCode

class Solution1 {
    fun canJump1(nums: IntArray): Boolean {
        var maxReach = 0
        for (i in nums.indices) {
            if (i > maxReach) return false
            maxReach = maxOf(maxReach, i + nums[i])
        }
        return true
    }
    fun canJump(nums: IntArray):Int {

        var k =0
        var j=0

for ( i in nums.indices) {
    if (k >= nums.size ){
        return j
    }
    else{
       if (nums[i] != 0) j++
        k+=nums[i]


    }
}
        return j



}
    fun strStr(haystack: String, needle: String): Int {
        return haystack.indexOf(needle)
    }


        fun lengthOfLastWord(s: String): Int {
        s.split(" ").forEach {
          //  println(it)
        }
        return s.trim().split(" ").last().length
    }
}


fun main(){
    val s=Solution1()

  //  println(s.canJump(intArrayOf(2,0,1,4)))
   // println(s.lengthOfLastWord("Hello World   "))
    println(s.strStr("helloll","ll"))



}