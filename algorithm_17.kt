class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        var num : Long = n
        while(num!=0L) {   
            answer = answer + (num%10).toInt()
            num /= 10
        }
        return answer
    }
}

/*
class Solution {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }
}
*/