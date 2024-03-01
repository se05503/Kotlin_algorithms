class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1 in 0..10000 && num2 in 0..10000) {
            if(num1==num2) {
                answer=1 
            } else {
                answer=-1
            }
        }
        return answer
    }
}