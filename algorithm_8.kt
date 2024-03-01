class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        if(angle >0 && angle < 90) {
            answer=1
        } else if(angle ==90) {
            answer=2
        } else if(angle>90 && angle<180) {
            answer = 3
        } else if(angle==180) {
            answer = 4
        } else {
            answer = 0
        }
        return answer
    }
}

/* 
class Solution {
    fun solution(angle: Int) = when {
        (angle in 1..89) -> 1
        (angle == 90) -> 2
        (angle in 91..179) -> 3
        (angle == 180) -> 4
        else -> 0
    }
}
*/