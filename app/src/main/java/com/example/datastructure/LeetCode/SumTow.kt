package com.example.datastructure.LeetCode

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }

    fun avlible(nums: IntArray, target: Int): IntArray {

        return ( nums.filter { it<target }).toIntArray()


    }
}
fun main (){
    val arr = intArrayOf(1,2,4,6)
    val target = 7
    val solution = Solution()
    val result = solution.twoSum(arr, target)
    println(result.toList())
    println( if ( 0+0 == target) {
        true
    } else false)



}