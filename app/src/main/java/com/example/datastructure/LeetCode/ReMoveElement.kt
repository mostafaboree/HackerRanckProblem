package com.example.datastructure.LeetCode

import kotlin.math.max

class ReMoveElement {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        val rotated = IntArray(n)
        for (i in 0 until n) {
            rotated[(i + k) % n] = nums[i]

        }
        for (i in 0 until n) {
            nums[i] = rotated[i]
        }


    }


    fun majorityElement(nums: IntArray): Int {
        val majority = (nums.size / 2) +1

             val arr=nums.sorted()
        return if (arr.first()== arr[majority]) arr.first() else arr[majority]

    }
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size <= 2) return nums.size

        var index = 2
        for (i in 2 until nums.size) {
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i]
            }
        }
        return index

    }
    fun removeDuplicates(nums: IntArray,k:Int): Int {
        if (nums.isEmpty()) return 0

        var k = 0// Pointer for the position of the next unique element
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for (i in nums.indices) {
            if (nums[i] != `val`) {
                nums[k] = nums[i]
                k++
            }
        }
        return k
    }


    fun maxProfit(prices: IntArray): Int {
        if (prices.isEmpty()) return 0

        var minPrice = Int.MAX_VALUE
        var maxProfit = 0

        for (price in prices) {
            if (price < minPrice) {
                minPrice = price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice
            }
        }

        return maxProfit
    }

}
fun main (){
    val s = ReMoveElement()

    println(s.maxProfit(intArrayOf(2,4,1)))



}