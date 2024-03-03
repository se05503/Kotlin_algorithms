class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        var num : Long = n
        var i : Int = 0
        while(num!=0L) {   
            answer[i]=(num%10).toInt()
            i += 1
            num /= 10
        }
        return answer
    }
}
//commit