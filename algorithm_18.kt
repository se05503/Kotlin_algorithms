class Solution {
    fun solution(s: String): Int {
        var answer = 0
        if(s.length in 1..5) {
            if(s.first()!='0') {
                answer = s.toInt()
            }
        }
        return answer
    }
}