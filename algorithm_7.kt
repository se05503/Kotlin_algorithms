import kotlin.math.round
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if(num1 in 0..100 && num2 in 0..100) {

            val pre_answer : Double = (num1.toDouble() / num2)*1000
            answer = round(pre_answer).toInt()
            // answer = (num1/num2)*1000 (처음 작성한 코드)
        }
        return answer
    }
}