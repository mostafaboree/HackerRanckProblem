package com.example.datastructure.LeetCode

class MergSort {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
            val size=n+m
            val mergList=IntArray(size){0}
            val nums=nums1.slice(0 until m)
            //println(nums.toList())
            var i=0
            var j=0
            var k=0
            for (k in 0 until size){
                if (i>=m){
                    mergList[k]=nums2[j]
                    j++
                    continue
                }
                if (j>=n){
                    mergList[k]=nums1[i]
                    i++
                    continue
                }
                if (nums[i]<nums2[j]){
                    mergList[k]=nums1[i]
                    i++
                }else{
                    mergList[k]=nums2[j]
                    j++
                }

            }
            println(mergList.toList())


        }

}
fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var i = m - 1
    var j = n - 1
    var k = m + n - 1

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k--] = nums1[i--]
        } else {
            nums1[k--] = nums2[j--]
        }
    }

    while (j >= 0) {
        nums1[k--] = nums2[j--]
    }
}
fun main(){
    val obj=MergSort()
    obj.merge(intArrayOf(1,2,3,0,0,0),3, intArrayOf(2,5,6),3)

}