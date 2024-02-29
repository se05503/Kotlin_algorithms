class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1 in -50000 .. 50000 && num2 in -50000 .. 50000) {
            answer = num1+num2
        } 
        return answer
    }
}