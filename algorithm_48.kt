package com.example.practice

fun main() {
    val arr = intArrayOf(1,5,2,6,3,7,4)
    val commands = arrayOf(intArrayOf(2,5,3), intArrayOf(4,4,1), intArrayOf(1,7,3))
    val obj = Solution()
    println(obj.solution(arr,commands))
}

class Solution {
    var answer = intArrayOf()

    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        require(array.size in 1..100 && array.all { it in 1..100}
                &&commands.size in 1..50 && commands.all {it.size==3})
        for(i in 0 until commands.size) { // i : 0 → 1 → 2
            var temp = array.slice(commands[i][0]-1..commands[i][1]-1) // [5,2,6,3]
            temp = temp.sorted() // [2,3,5,6]
            val element = temp[commands[i][2]-1] // 5
            answer += element
        }
        return answer
    }
}