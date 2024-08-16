package com.example.datastructure.HackerRank

class Stuck<T>{
    val items: MutableList<T> = mutableListOf<T>()
    fun push(element: T) = items.add(element)
    fun pop(): T? = if (items.isNotEmpty()) items.removeAt(items.size - 1) else null
    fun peek(): T? = items.lastOrNull()



}
fun getMax(operations: Array<String>): Array<Int> {
    val stack = Stuck<Int>()
    val maxStack = Stuck<Int>()
    val result = mutableListOf<Int>()
    for (operation in operations) {
        val parts = operation.split(" ")
        when (parts[0]) {
            1.toString() -> {
                val num = parts[1].toInt()
                stack.push(num)


            }
            2.toString() -> {
                val popped = stack.pop()


            }
            3.toString() -> {
                result.add(stack.items.maxOrNull() ?: 0)
            }

        }

    }

   return result.toTypedArray()

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ops = Array<String>(n, { "" })
    for (i in 0 until n) {
        val opsItem = readLine()!!
        ops[i] = opsItem
    }

    val res = getMax(ops)

    println(res.joinToString("\n"))
}

